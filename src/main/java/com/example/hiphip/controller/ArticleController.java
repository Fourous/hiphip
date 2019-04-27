package com.example.hiphip.controller;

import com.example.hiphip.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("articleget")
    public Map<String, Object> articleget() {
        Map<String, Object> map = new HashMap<>();
        map.put("articlelist",articleService.articleget());
        return map;
    }
    @PostMapping("articleupdate")
    public boolean articleupdate(Integer articleId, String title, String content, String pic, String brief){
        return articleService.articleupdate(articleId, title, content, pic, brief);
    }
    @PostMapping("articleinsert")
    public boolean articleinsert(String title, String content, String pic, String brief) {
        return articleService.articleinsert(title, content, pic, brief);
    }
    @PostMapping("articledelete")
    public boolean articledelete(Integer articleId) {
        return articleService.articledelete(articleId);
    }

    }
