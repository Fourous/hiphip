package com.example.hiphip.Service;

import com.example.hiphip.Entity.Advertise;
import com.example.hiphip.Entity.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ArticleService {
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
    boolean articleupdate(@Param("articleId")Integer articleId, @Param("title") String title, @Param("content") String content, @Param("pic") String pic, @Param("brief")String brief);
    /**
     * @param brief
     * @param title
     * @param content
     * @param pic
     * @return
     */
    boolean articleinsert(String title, String content, String pic,String brief);
    /**
     * @param articleId
     * @return
     */
    boolean articledelete(Integer articleId);
}
