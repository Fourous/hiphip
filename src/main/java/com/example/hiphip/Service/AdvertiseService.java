package com.example.hiphip.Service;

import com.example.hiphip.Entity.Advertise;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AdvertiseService {

    Page <Advertise> advertiseget();
    /**
     * @param title
     * @param content
     * @param pic
     * @return
     */
    boolean advertiseinsert(String title, String content, String pic);

    /**
     * @param advertiseId
     * @param content
     * @param title
     * @param pic
     * @return
     */
    boolean advertiseupdate(Integer advertiseId,String title,String content,String pic);
    /**
     *
     * @param title
     * @return
     */
    boolean advertisedelete(String title);
}
