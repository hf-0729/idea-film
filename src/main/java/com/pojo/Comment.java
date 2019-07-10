package com.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.Date;

@TableName("comment")
public class Comment implements Serializable {

    private int id;
    private int uid;
    private int fid;
    private Date date;
    private String title;
    private String content;
    private int onclick;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOnclick() {
        return onclick;
    }

    public void setOnclick(int onclick) {
        this.onclick = onclick;
    }
}
