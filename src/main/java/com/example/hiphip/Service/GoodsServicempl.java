package com.example.hiphip.Service;

import com.example.hiphip.Entity.Goods;
import com.example.hiphip.mapper.GoodsMapper;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class GoodsServicempl implements GoodsService{
    @Autowired
    private GoodsMapper goodsMapper;
    //列出商品
    public Page<Goods> goodsget() {
        return goodsMapper.goodsget();
    }
    //通过name查找商品
    public List<Goods> goodnameget(String goodname){
        return goodsMapper.goodnameget(goodname);
    }
    //通过goodtypeId查找商品
    public List<Goods> goodtypeIdget(Integer goodtypeId){
        return goodsMapper.goodtypeIdget(goodtypeId);
    }
    //商品上架
    public boolean goodinsert(String goodname,double price,String description,Integer goodtypeId,String goodimg){
        if(goodsMapper.goodinsert( goodname, price, description, goodtypeId, goodimg)>0)
            return true;
        else return false;
    }
    //商品下架
    public boolean gooddelete(String goodId){
        if(goodsMapper.gooddelete(goodId)>0)
            return true;
        else return false;
    }
    //上传图片
    /*public String uploadpic(MultipartFile file,HttpServletRequest request){
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
*/

}
