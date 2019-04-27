package com.example.hiphip.Entity;

import java.io.Serializable;

/**
 * 商品订单实体类
 */
public class GoodOrder implements Serializable {

  private Integer id;//订单id
  private String openid;//微信用户openid
  private String outTradeNo;//订单唯一标识
  private Integer state;//订单状态，0表示未支付，1表示已支付
  private java.sql.Timestamp creatTime;//订单创建时间
  private java.sql.Timestamp notifyTime;//订单回调时间
  private String userId;
  private String nickName;//用户昵称
  private String headImg;//用户头像
  private Integer goodId;//商品id
  private String goodName;//商品名
  private String goodImg;//商品图片
  private Integer del;//订单删除
  private Integer totalFee;//金额，以分为单位


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }


  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }


  public java.sql.Timestamp getCreatTime() {
    return creatTime;
  }

  public void setCreatTime(java.sql.Timestamp creatTime) {
    this.creatTime = creatTime;
  }


  public java.sql.Timestamp getNotifyTime() {
    return notifyTime;
  }

  public void setNotifyTime(java.sql.Timestamp notifyTime) {
    this.notifyTime = notifyTime;
  }


  public String getNickname() {
    return nickName;
  }

  public void setNickname(String nickname) {
    this.nickName = nickname;
  }


  public String getHeadImg() {
    return headImg;
  }

  public void setHeadImg(String headImg) {
    this.headImg = headImg;
  }


  public Integer getGoodId() {
    return goodId;
  }

  public void setGoodId(Integer goodId) {
    this.goodId = goodId;
  }


  public String getGoodName() {
    return goodName;
  }

  public void setGoodName(String goodName) {
    this.goodName = goodName;
  }


  public String getGoodImg() {
    return goodImg;
  }

  public void setGoodImg(String goodImg) {
    this.goodImg = goodImg;
  }


  public Integer getDel() {
    return del;
  }

  public void setDel(Integer del) {
    this.del = del;
  }


  public Integer getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(Integer totalFee) {
    this.totalFee = totalFee;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
