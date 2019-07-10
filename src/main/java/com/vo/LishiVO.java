package com.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.print.attribute.standard.OrientationRequested;
import java.io.Serializable;
import java.sql.Date;

public class LishiVO implements Serializable {

    private Integer uid;
    private Integer fid;
    private String filmname;
    private Date date;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
