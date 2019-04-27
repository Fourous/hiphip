package com.example.hiphip.utils;

import com.example.hiphip.Entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class jwtUtils {

    public static final String SUBJECT  ="hiphip";
    public static final long EXPIRE =   1000*60*60*20*7;//过期时间，毫秒，一周
   //密钥
   public static final String APPSECRET ="hiphip666";

    /**
     * 生成jwt
     * @param user
     * @return
     */
    public static String geneJsonWebToken(User user){
        if(user==null||user.getUserId()==null||user.getNickname()==null||user.getAvatarUrl()==null){
            return null;
        }
        String token=Jwts.builder().setSubject(SUBJECT)
                      .claim("userId",user.getUserId())
                      .claim("nickname",user.getNickname())
                      .claim("avatarUrl",user.getAvatarUrl())
                      .setIssuedAt(new Date())
                      .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                      .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();

        return token;
    }

    /**
     * 校验token
     * @param token
     * @return
     */
    public static Claims checkJwt(String token){

        try {
            final Claims claims=Jwts.parser().setSigningKey(APPSECRET).parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e){}
            return null;

    }
}
