package com.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("actorfilm")
public class ActorFilm implements Serializable {

    private Integer filmid;
    private Integer aid;

    public Integer getFilmid() {
        return filmid;
    }

    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }
}
