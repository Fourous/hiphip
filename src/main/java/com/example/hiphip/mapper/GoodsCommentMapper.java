package com.example.hiphip.mapper;

import com.example.hiphip.Entity.Advertise;
import com.example.hiphip.Entity.GoodsComment;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.dom4j.Text;

import java.util.List;
@Mapper
public interface GoodsCommentMapper {
    /**
     *
     * @return
     */
    Page<GoodsComment> goodcommentget();
    /**
     * @param goodId
     * @param comment
     * @return
     */
    int goodcommentinsert(String goodId, String comment);
    /**
     * @param commentId
     * @param comment
     * @return
     */
    int goodcommentupdate(Integer commentId,String comment);
    /**
     * @param commentId
     * @return
     */
    int goodcommentdelete(Integer commentId);

}
