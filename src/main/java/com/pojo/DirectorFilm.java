package com.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("directorfilm")
public class DirectorFilm implements Serializable {

    private Integer filmid;
    private Integer did;

    public Integer getFilmid() {
        return filmid;
    }

    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
