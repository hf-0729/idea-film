package com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.FilmDAO;
import com.pojo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmDAO filmDAO;

    /***
     * 查找所有电影
     * @return
     */
    public List findAllFilm() {
        List list = filmDAO.selectList(null);
        return list;
    }

    public List FilmType(Integer typeid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("typeid",typeid);
        List list = filmDAO.selectList(queryWrapper);
        return list;
    }

    /***
     * 电影简介页面
     * @param fid
     * @return
     */
    public Film ifilm(int fid) {
        Film film = filmDAO.selectById(fid);
        return film;
    }

    /***
     * 电影排行榜
     * @return
     */
    public List click() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.orderByDesc("onclick");
        queryWrapper.last("limit 10");
        List list = filmDAO.selectList(queryWrapper);
        return list;
    }

    public List likesearch(String s) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("filmname",s);
        queryWrapper.or();
        queryWrapper.like("keyword",s);

        List film = filmDAO.selectList(queryWrapper);

        return film;
    }

    /***
     * lishiservice调用
     * 根据fid查找电影的名称
     * @param fid
     * @return
     */
    public Film fname(int fid) {
        Film film = filmDAO.selectById(fid);
        return film;
    }

    /***
     * 随机查找十条电影
     * @return
     */
//    public List randsearch() {
//        List list;
//        return list;
//
//    }
}
