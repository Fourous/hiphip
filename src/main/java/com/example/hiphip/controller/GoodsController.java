package com.example.hiphip.controller;

import com.example.hiphip.Entity.Goods;
import com.example.hiphip.Service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@SpringBootApplication
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 商品展示分页接口
     * @param page  当前第几页，默认为第1页
     * @param size  每页显示几条，默认为10条
     * @return
     */
    @GetMapping("goodsget")
   public Object goodsget(@RequestParam(value = "page",defaultValue = "1") int page,
                          @RequestParam(value = "size",defaultValue = "10") int size){
        PageHelper.startPage(page, size);
        List<Goods> list=goodsService.goodsget();
        PageInfo<Goods> pageInfo=new PageInfo<>(list);
        Map<String,Object>  data=new HashMap<>();
        data.put("total_size",pageInfo.getTotal());//总条数
        data.put("total_page",pageInfo.getPages());//总页数
        data.put("current_page",page);//当前页
        data.put("data",pageInfo.getList());//数据
       return data;
    }
    @GetMapping("goodnameget")
    public Map<String, Object> goodnameget(String goodname){
        Map<String, Object> map = new HashMap<>();
        map.put("goodsnamelist", goodsService.goodnameget(goodname));
        return map;
    }
    @GetMapping("goodtypeIdget")
    public Map<String, Object> goodtypeIdget(Integer goodtypeId){
        Map<String, Object> map = new HashMap<>();
        map.put("goodsdescriptionlist", goodsService.goodtypeIdget(goodtypeId));
        return map;
    }
    @PostMapping("goodinsert")
    public boolean goodinsert(String goodname,double price,String description,Integer goodtypeId,String goodimg){
        return goodsService.goodinsert(goodname, price, description,goodtypeId, goodimg);
    }
    @PostMapping("gooddelete")
    public boolean gooddelete(String goodId){
        return goodsService.gooddelete(goodId);
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String uploadpic(MultipartFile file,HttpServletRequest request){
        try {
            //创建文件在服务器端存放路径
            String dir =request.getServletContext().getRealPath("/usr/lib/jvm/img/upload");
            File fileDir=new File(dir);
            if(!fileDir.exists())
                fileDir.mkdirs();
            //生成文件在服务器端存放的名字
            String fileSuffix=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            String fileName= UUID.randomUUID().toString()+fileSuffix;
            File files=new File(fileDir+"/"+fileName);
            //上传
            file.transferTo(files);


        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }


        return "上传成功";
    }
    }


