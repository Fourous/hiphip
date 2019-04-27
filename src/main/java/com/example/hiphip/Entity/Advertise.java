package com.example.hiphip.Entity;

import java.io.Serializable;

/**
 * 公告实体类
 */
public class Advertise implements Serializable {

  private Integer advertiseId;//公告id
  private java.sql.Timestamp date;//公告日期
  private String title;//公告名
  private String content;//公告内容
  private String pic;//公告图片


  public Integer getAdvertiseId() {
    return advertiseId;
  }

  public void setAdvertiseId(Integer advertiseId) {
    this.advertiseId = advertiseId;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }

}
