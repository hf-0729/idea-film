package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

@TableName("user")
public class User implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String uname;
    private String ucode;
    private Integer  usex;
    private Date ubirthday;
    private Integer ufear;
    private Integer uquanxian;
    private Integer vip;
    private String img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public Integer getUsex() {
        return usex;
    }

    public void setUsex(Integer usex) {
        this.usex = usex;
    }

    public Date getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public Integer getUfear() {
        return ufear;
    }

    public void setUfear(int ufear) {
        this.ufear = ufear;
    }

    public Integer getUquanxian() {
        return uquanxian;
    }

    public void setUquanxian(Integer uquanxian) {
        this.uquanxian = uquanxian;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
