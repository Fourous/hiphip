package com.example.hiphip.controller;

import com.example.hiphip.Entity.Advertise;
import com.example.hiphip.Service.AdvertiseService;
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
public class AdvertiseController {
    @Autowired
    private AdvertiseService advertiseService;

    @GetMapping("advertiseget")
    public Object advertiseget(@RequestParam(value = "page",defaultValue = "1") int page,
                               @RequestParam(value = "size",defaultValue = "10") int size) {
        PageHelper.startPage(page, size);
        List<Advertise> list=advertiseService.advertiseget();
        PageInfo<Advertise> pageInfo=new PageInfo<>(list);
        Map<String,Object>  data=new HashMap<>();
        data.put("total_size",pageInfo.getTotal());//总条数
        data.put("total_page",pageInfo.getPages());//总页数
        data.put("current_page",page);//当前页
        data.put("data",pageInfo.getList());//数据
        return data;
    }
    @PostMapping("advertiseupdate")
    public boolean advertiseupdate(Integer advertiseId,String title, String content, String pic){
        return advertiseService.advertiseupdate(advertiseId, title, content, pic);
    }
    @PostMapping("advertiseinsert")
    boolean advertiseinsert(String title, String content, String pic){
        return advertiseService.advertiseinsert(title, content, pic);
    }
    @PostMapping("advertisedelete")
    boolean advertisedelete(String title){
        return advertiseService.advertisedelete(title);
    }

}
