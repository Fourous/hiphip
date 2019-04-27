package com.example.hiphip.Service;

import com.example.hiphip.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    /**
     *
     * @return
     */
    List<User> userget();
    /**
     * @param nickname
     * @param openId
     * @@param avatarUrl
     * @return
     */
    public boolean userinsert(String openId,String nickname,String avatarUrl);
    /**
     * @param nickname
     * @param openId
     * @return
     */
    public boolean usernicknameupdate(String openId,String nickname);
    /**
     * @param avatarUrl
     * @param openId
     * @return
     */
    public boolean useravatarUrlupdate(String openId,String avatarUrl);

}
