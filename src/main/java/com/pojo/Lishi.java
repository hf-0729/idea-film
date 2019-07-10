package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import javax.print.attribute.standard.OrientationRequested;
import java.io.Serializable;
import java.sql.Date;

@TableName("lishi")
public class Lishi implements Serializable {

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;
    private Integer fid;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
