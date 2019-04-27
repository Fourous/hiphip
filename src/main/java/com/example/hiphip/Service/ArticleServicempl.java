package com.example.hiphip.Service;

import com.example.hiphip.Entity.Article;
import com.example.hiphip.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServicempl implements ArticleService{
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public List<Article> articleget() {
        return articleMapper.articleget();
    }

    @Override
        public boolean articleupdate(Integer articleId, String title, String content, String pic, String brief) {
        if(articleMapper.articleupdate(articleId, title, content, pic, brief)>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean articleinsert(String title, String content, String pic, String brief) {
        if(articleMapper.articleinsert(title, content, pic, brief)>0)
            return true;
        else
            return false;
    }

    @Override
    public boolean articledelete(Integer articleId) {
        if(articleMapper.articledelete(articleId)>0)
            return true;
        else
            return false;
    }
}
