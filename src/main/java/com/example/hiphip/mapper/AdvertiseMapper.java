package com.example.hiphip.mapper;


import com.example.hiphip.Entity.Advertise;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.dom4j.Text;

import java.util.List;

@Mapper
public interface AdvertiseMapper {
    /**
     *
     * @return
     */
    Page<Advertise> advertiseget();
    /**
     * @param advertiseId
     * @param title
     * @param content
     * @param pic
     * @return
     */
    int advertiseupdate(@Param("advertiseId") Integer advertiseId,@Param("title") String title, @Param("content") String content, @Param("pic") String pic);
    /**
     * @param title
     * @param content
     * @param pic
     * @return
     */
    int advertiseinsert(String title, String content, String pic);
    /**
     * @param title
     * @return
     */
    int advertisedelete(String title);
}
