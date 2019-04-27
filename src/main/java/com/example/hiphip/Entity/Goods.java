package com.example.hiphip.Entity;

import java.io.Serializable;

/**
 * 商品实体类
 */
public class Goods implements Serializable {

  private Integer goodId;//商品id
  private Integer goodtypeId;
  private String goodname;//商品名
  private double price;//商品价格
  private String description;//商品描述
  private String goodimg;//商品图片
  private java.sql.Timestamp onlinetime;//上架时间



  public Integer getGoodId() {
    return goodId;
  }

  public void setGoodId(Integer goodId) {
    this.goodId = goodId;
  }


  public String getGoodname() {
    return goodname;
  }

  public void setGoodname(String goodname) {
    this.goodname = goodname;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getGoodimg() {
    return goodimg;
  }

  public void setGoodimg(String goodimg) {
    this.goodimg = goodimg;
  }


  public java.sql.Timestamp getOnlinetime() {
    return onlinetime;
  }

  public void setOnlinetime(java.sql.Timestamp onlinetime) {
    this.onlinetime = onlinetime;
  }

  public Integer getGoodtypeId() {
    return goodtypeId;
  }

  public void setGoodtypeId(Integer goodtypeId) {
    this.goodtypeId = goodtypeId;
  }
}
