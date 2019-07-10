package com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.ScDAO;
import com.pojo.Sc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ScService {

    @Autowired
    private ScDAO scDAO;

    public int collection(int uid, int fid, Date date) {
        Sc sc = new Sc();
        sc.setUid(uid);
        sc.setFid(fid);
        sc.setDate(date);
        int n = scDAO.insert(sc);
        return n;
    }

    public List select(int uid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid",uid);
        List list = scDAO.selectList(queryWrapper);
        return list;
    }
}
