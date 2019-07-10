package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("session")
public class Session implements Serializable {

    @TableId(value = "sessionid",type = IdType.AUTO)
    private Integer sessionid;
    private String session;

    public Integer getSessionid() {
        return sessionid;
    }

    public void setSessionid(Integer sessionid) {
        this.sessionid = sessionid;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
