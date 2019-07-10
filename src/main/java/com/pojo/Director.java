package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("director")
public class Director implements Serializable {
    @TableId(value = "did",type = IdType.AUTO)
    private  int did;
    private String dname;
    private Enum dsex;
    private Date dbirthday;
    private int dzoneid;
    private String dintro;
    private String dimg;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Enum getDsex() {
        return dsex;
    }

    public void setDsex(Enum dsex) {
        this.dsex = dsex;
    }

    public Date getDbirthday() {
        return dbirthday;
    }

    public void setDbirthday(Date dbirthday) {
        this.dbirthday = dbirthday;
    }

    public int getDzoneid() {
        return dzoneid;
    }

    public void setDzoneid(int dzoneid) {
        this.dzoneid = dzoneid;
    }

    public String getDintro() {
        return dintro;
    }

    public void setDintro(String dintro) {
        this.dintro = dintro;
    }

    public String getDimg() {
        return dimg;
    }

    public void setDimg(String dimg) {
        this.dimg = dimg;
    }
}
