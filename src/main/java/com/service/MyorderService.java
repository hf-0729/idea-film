package com.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.MyorderDAO;
import com.dao.UserDAO;
import com.pojo.Myorder;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyorderService {

    @Autowired
    private MyorderDAO myorderDAO;

    @Autowired
    private UserDAO userDAO;

    public boolean order(int x, String uname, int fid, java.sql.Date date, int price) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uname",uname);
        User u = userDAO.selectOne(queryWrapper);
        int uid = u.getId();
        System.out.println(date);
        Date date1 = new Date();
        int oid = ((int) date1.getTime())*-1;
        if (x==1){
            Myorder o = new Myorder();
            o.setOid(oid);
            o.setType(x);
            o.setUid(uid);
            o.setFid(fid);
            o.setDate(date);
            o.setPrice(price);
            int n = myorderDAO.insert(o);
            return true;
        }
        return true;
    }



}
