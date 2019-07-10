package com.test;

import com.alibaba.fastjson.JSONObject;
import com.pojo.Film;

import java.sql.Date;

public class Json {

    public static void main(String[] args) {
        Film film = new Film();
        Date date = new Date(new java.util.Date().getTime());
        film.setFilmname("暮光之城");
        film.setDate(date);
        film.setOnclick(3055);
        film.setScore(Float.parseFloat("7.8"));

        JSONObject jsonObject = new JSONObject();
        String s = jsonObject.toJSONString(film);
        System.out.println(s);
    }

}
