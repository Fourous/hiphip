package com.example.hiphip.Service;

import com.example.hiphip.Entity.GoodsComment;
import com.example.hiphip.mapper.GoodsCommentMapper;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsCommentServicempl implements GoodsCommentService{
    @Autowired
    private GoodsCommentMapper goodsCommentMapper;
    //列出评论
    public Page<GoodsComment> goodcommentget(){
        return goodsCommentMapper.goodcommentget();
    }
    //添加评论
    public boolean goodcommentinsert(String goodId, String comment){
        if(goodsCommentMapper.goodcommentinsert(goodId, comment)>0){
            return true;
        }
        else return false;
    }
    //删除评论
    public boolean goodcommentdelete(Integer commenetId){
        if(goodsCommentMapper.goodcommentdelete(commenetId)>0)
            return true;
        else return false;
    }
    //修改评论
    public boolean goodcommentupdate(Integer commentId,String comment){
        if(goodsCommentMapper.goodcommentupdate(commentId, comment)>0)
            return true;
        else return false;
    }

}
