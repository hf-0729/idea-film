package com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.ActorDAO;
import com.pojo.Actor;
import com.pojo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorDAO actorDAO;

    public List allactor() {

        List list = actorDAO.selectList(null);
        return list;

    }

    public List likesearch(String s) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("aname",s);
        List actor = actorDAO.selectList(queryWrapper);
        return actor;

    }
}
