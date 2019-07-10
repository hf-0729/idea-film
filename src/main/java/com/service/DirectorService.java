package com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.DirectorDAO;
import com.pojo.Director;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {
    @Autowired
    private DirectorDAO directorDAO;

    public List likesearch(String s) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("dname",s);
        List director = directorDAO.selectList(queryWrapper);
        return director;
    }
}
