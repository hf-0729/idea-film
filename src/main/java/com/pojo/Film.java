package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Date;

@TableName("film")
public class Film implements Serializable {

    @TableId(value = "filmid",type = IdType.AUTO)
    private Integer filmid;
    private String filmname;
    private Integer typeid;
    private Integer zoneid;
    private Integer dateid;
    private String filmtime;
    private String filmintro;
    private float score;
    private Integer  price;
    private Integer onclick;
    private String img;
    private String src;
    private Date date;
    private Integer vipfilm;
    private Integer buyfilm;
    private String keyword;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
    public Integer getFilmid() {
        return filmid;
    }

    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getZoneid() {
        return zoneid;
    }

    public void setZoneid(Integer zoneid) {
        this.zoneid = zoneid;
    }

    public Integer getDateid() {
        return dateid;
    }

    public void setDateid(Integer dateid) {
        this.dateid = dateid;
    }

    public String getFilmtime() {
        return filmtime;
    }

    public void setFilmtime(String filmtime) {
        this.filmtime = filmtime;
    }

    public String getFilmintro() {
        return filmintro;
    }

    public void setFilmintro(String filmintro) {
        this.filmintro = filmintro;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOnclick() {
        return onclick;
    }

    public void setOnclick(Integer onclick) {
        this.onclick = onclick;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getVipfilm() {
        return vipfilm;
    }

    public void setVipfilm(Integer vipfilm) {
        this.vipfilm = vipfilm;
    }

    public Integer getBuyfilm() {
        return buyfilm;
    }

    public void setBuyfilm(Integer buyfilm) {
        this.buyfilm = buyfilm;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
