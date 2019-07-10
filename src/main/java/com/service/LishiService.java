package com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.LishiDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LishiService {

    @Autowired
    private LishiDAO lishiDAO;

    public List shistory(int uid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid",uid);
        List user = lishiDAO.selectList(queryWrapper);
        return user;
    }


}
