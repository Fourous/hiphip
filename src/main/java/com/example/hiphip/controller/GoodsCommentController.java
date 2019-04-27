package com.example.hiphip.controller;

import com.example.hiphip.Entity.GoodsComment;
import com.example.hiphip.Service.GoodsCommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@SpringBootApplication
public class  GoodsCommentController {
    @Autowired
    private GoodsCommentService goodsCommentService;

    /**
     * 评论展示分页接口
     * @return
     */
    @GetMapping("goodcommentget")
    public Object goodcommentget(@RequestParam(value = "page",defaultValue = "1") int page,
                                 @RequestParam(value = "size",defaultValue = "10") int size){
        PageHelper.startPage(page, size);
        List<GoodsComment> list=goodsCommentService.goodcommentget();
        PageInfo<GoodsComment> pageInfo=new PageInfo<>(list);
        Map<String,Object>  data=new HashMap<>();
        data.put("total_size",pageInfo.getTotal());//总条数
        data.put("total_page",pageInfo.getPages());//总页数
        data.put("current_page",page);//当前页
        data.put("data",pageInfo.getList());//数据
        return data;

    }
    @PostMapping("goodcommentinsert")
    public boolean goodcommentinsert(String goodId,String comment){
        return goodsCommentService.goodcommentinsert(goodId, comment);
    }
    @PostMapping("goodcommentdelete")
    public boolean goodcommentdelete(Integer commentId){
        return goodsCommentService.goodcommentdelete(commentId);
    }
    @PostMapping("goodcommentupdate")
    public boolean goodcommentupdate(Integer commentId, String comment){
        return goodsCommentService.goodcommentupdate(commentId, comment);
    }

}
