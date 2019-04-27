package com.example.hiphip.Service;

import com.example.hiphip.Entity.Advertise;
import com.example.hiphip.mapper.AdvertiseMapper;
import com.github.pagehelper.Page;
import org.dom4j.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdvertiseServicempl implements AdvertiseService{
    @Autowired

    private AdvertiseMapper advertiseMapper;

    //列出公告
    public Page <Advertise> advertiseget(){
        return advertiseMapper.advertiseget();
    }
    //添加公告
    public boolean advertiseinsert(String title, String content, String pic){
        if(advertiseMapper.advertiseinsert(title,content,pic)>0){
            return true;
        }
        else return false;
    }
    //修改公告
    public boolean advertiseupdate(Integer advertiseId,String title,String content,String pic){
    if(advertiseMapper.advertiseupdate(advertiseId, title, content, pic)>0)
        return true;
    else return false;
    }
    //删除公告
    public boolean advertisedelete(String title){
        if(advertiseMapper.advertisedelete(title)>0)
            return true;
        else return false;
    }


}
