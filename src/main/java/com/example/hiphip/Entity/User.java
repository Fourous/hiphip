package com.example.hiphip.Entity;

import java.io.Serializable;

/**
 * 用户实体类
 */

public class User implements Serializable {

    private Integer userId;//用户主键
    private String openId;//用户微信openId
    private String nickname;//用户昵称
    private String avatarUrl;//用户头像地址
    private java.sql.Timestamp creattime;//用户创建时间


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }


    public java.sql.Timestamp getCreattime() {
        return creattime;
    }

    public void setCreattime(java.sql.Timestamp creattime) {
        this.creattime = creattime;
    }

}
