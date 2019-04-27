package com.example.hiphip.mapper;

import com.example.hiphip.Entity.Advertise;
import com.example.hiphip.Entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapper {
    /**
     *
     * @return
     */
    List<Article> articleget();
    /**
     * @param articleId
     * @param title
     * @param content
     * @param pic
     * @param brief
     * @return
     */
    int articleupdate( @Param("articleId")Integer articleId,@Param("title") String title, @Param("content") String content, @Param("pic") String pic,@Param("brief")String brief);
    /**
     * @param brief
     * @param title
     * @param content
     * @param pic
     * @return
     */
    int articleinsert(String title, String content, String pic,String brief);
    /**
     * @param articleId
     * @return
     */
    int articledelete(Integer articleId);
}
