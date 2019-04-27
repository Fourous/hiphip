package com.example.hiphip.mapper;

import com.example.hiphip.Entity.Goods;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Mapper
public interface GoodsMapper {
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
     * @param description
     * @param price
     * @param goodname
     * @param goodimg
     * @return
     */
    int goodinsert(String goodname,double price,String description,Integer goodtypeId,String goodimg);
    /**
     * @param goodId
     * @return
     */
    int gooddelete(String goodId);
/*
    int uploadpic( MultipartFile file, HttpServletRequest request);*/
}
