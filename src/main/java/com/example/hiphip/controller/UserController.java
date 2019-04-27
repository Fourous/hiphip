package com.example.hiphip.controller;

import com.example.hiphip.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("userget")
    public Map<String,Object> userget(){
        Map<String,Object> map=new HashMap<>();
        map.put("userlist",userService.userget());
        return map;
    }
    @PostMapping("userinsert")
    public boolean userinsert(String openId,String nickname,String avatarUrl){
        return userService.userinsert(openId,nickname,avatarUrl);
    }
    @PostMapping("useravatarUrlupdate")
    public boolean useravatarUrlupdate(String openId,String avatarUrl){
        return userService.useravatarUrlupdate(openId, avatarUrl);
    }
    @PostMapping("usernicknameupdate")
    public boolean usernicknameupdate(String openId,String nickname){
        return userService.usernicknameupdate(openId, nickname);
    }


}
