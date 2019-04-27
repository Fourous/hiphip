package com.example.hiphip.mapper;

import com.example.hiphip.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     *
     * @return
     */
    List<User> userget();
    /**
     * @param openId
     * @param nickname
     * @return
     */
    int userinsert(String openId,String nickname,String avatarUrl);
    /**
     * @param openId
     * @param avatarUrl
     * @return
     */
    int useravatarUrlupdate(String openId,String avatarUrl);
    /**
     * @param openId
     * @param nickname
     * @return
     */
    int usernicknameupdate(String openId,String nickname);
}
