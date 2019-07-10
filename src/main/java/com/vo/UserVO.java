package com.vo;

import java.sql.Timestamp;
import java.util.Date;

public class UserVO {
    private String uname;
    private String ucodes;
    private Enum  usex;
    private Date ubirthday;
    private String img;


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUcodes() {
        return ucodes;
    }

    public void setUcodes(String ucodes) {
        this.ucodes = ucodes;
    }

    public Enum getUsex() {
        return usex;
    }

    public void setUsex(Enum usex) {
        this.usex = usex;
    }

    public Date getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
