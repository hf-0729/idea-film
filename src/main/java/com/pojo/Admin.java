package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("admin")
public class Admin {

    @TableId(value = "adminid",type = IdType.AUTO)
    private int adminid;
    private String adminname;
    private String admincode;
    private String img;

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdmincode() {
        return admincode;
    }

    public void setAdmincode(String admincode) {
        this.admincode = admincode;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
