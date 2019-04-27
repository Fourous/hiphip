package com.example.hiphip.Service;

import com.example.hiphip.Entity.Goods;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Service
public interface GoodsService {
    /**
     *
     * @return
     */
    Page<Goods> goodsget();
    /**
     * @param goodname
     * @return
     */
    List<Goods> goodnameget(String goodname);
    /**
     * @param goodtypeId
     * @return
     */
    List<Goods> goodtypeIdget(Integer goodtypeId);
    /**
     *
     * @param goodname
     * @param price
     * @param description
     * @return
     */
    public boolean goodinsert(String goodname,double price,String description,Integer goodtypeId,String goodimg);
    /**
     * @param goodId
     * @return
     */
    public boolean gooddelete(String goodId);
/*
    public String uploadpic(MultipartFile file,HttpServletRequest request);*/
}
