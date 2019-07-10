package com.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Date;

@TableName("myorder")
public class Myorder implements Serializable {

    private Integer oid;
    private Integer type;
    private Integer uid;
    private Integer fid;
    private Date date;
    private Integer num;
    private Integer price;
    private Integer count;
    private Integer session;
    private String seat;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

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

    public Integer getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSession() {
        return session;
    }

    public void setSession(Integer session) {
        this.session = session;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }


}
