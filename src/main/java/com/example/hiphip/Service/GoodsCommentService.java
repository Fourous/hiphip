package com.example.hiphip.Service;


import com.example.hiphip.Entity.GoodsComment;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface GoodsCommentService {

    Page<GoodsComment> goodcommentget();
    /**
     * @param comment
     * @return
     */
    boolean goodcommentinsert(String goodId, String comment);

    /**
     *
     * @param commentId
     * @return
     */
    boolean goodcommentdelete(Integer commentId);
    /**
     *
     * @param comment
     * @return
     */
    boolean goodcommentupdate(Integer commentId,String comment);
}
