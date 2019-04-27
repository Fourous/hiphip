package com.example.hiphip.Service;

import com.example.hiphip.Entity.User;
import com.example.hiphip.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServicempl implements UserService {
    @Autowired
    private UserMapper userMapper;
    //列出用户
    public List<User> userget() {
        return userMapper.userget();
    }
    //添加用户
    public boolean userinsert(String openId,String nickname,String avatarUrl){
        if(userMapper.userinsert(openId, nickname,avatarUrl)>0)
            return true;
        else return false;
    }
    //修改用户昵称
    public boolean usernicknameupdate(String openId,String nickname){
        if(userMapper.usernicknameupdate(openId, nickname)>0)
            return true;
        else return false;
    }

    //修改用户头像
    public boolean useravatarUrlupdate(String openId,String avatarUrl){
        if(userMapper.useravatarUrlupdate(openId,avatarUrl)>0 )
            return true;
        else return false;

    }
}
