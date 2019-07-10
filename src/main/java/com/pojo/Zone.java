package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("zone")
public class Zone implements Serializable {

    @TableId(value = "zoneid",type = IdType.AUTO)
    private int zoneid;
    private String zonename;

    public int getZoneid() {
        return zoneid;
    }

    public void setZoneid(int zoneid) {
        this.zoneid = zoneid;
    }

    public String getZonename() {
        return zonename;
    }

    public void setZonename(String zonename) {
        this.zonename = zonename;
    }
}
