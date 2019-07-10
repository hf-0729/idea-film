package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.security.Principal;
import java.util.Date;

@TableName("actor")
public class Actor implements Serializable {
    @TableId(value = "aid",type = IdType.AUTO)
    private int aid;
    private String aname;
    private Enum asex;
    private Date abirthday;
    private  int azoneid;
    private String aintro;
    private String aimg;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Enum getAsex() {
        return asex;
    }

    public void setAsex(Enum asex) {
        this.asex = asex;
    }

    public Date getAbirthday() {
        return abirthday;
    }

    public void setAbirthday(Date abirthday) {
        this.abirthday = abirthday;
    }

    public int getAzoneid() {
        return azoneid;
    }

    public void setAzoneid(int azoneid) {
        this.azoneid = azoneid;
    }

    public String getAintro() {
        return aintro;
    }

    public void setAintro(String aintro) {
        this.aintro = aintro;
    }

    public String getAimg() {
        return aimg;
    }

    public void setAimg(String aimg) {
        this.aimg = aimg;
    }
}
