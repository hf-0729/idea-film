package com.service;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.AdminDAO;
import com.pojo.Admin;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminDAO adminDAO;

    public Admin login(String name,String code){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("adminname",name);

        Digester md5 = new Digester(DigestAlgorithm.MD5);
        String pass = md5.digestHex(code);
        String result = md5.digestHex(pass);

        queryWrapper.eq("ucode",result);
        Admin admin = adminDAO.selectOne(queryWrapper);
        return admin;
    }

}
