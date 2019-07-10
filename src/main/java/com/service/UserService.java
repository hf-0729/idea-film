package com.service;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.dao.UserDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.pojo.User;
import com.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;


    /***
     * 用户注册
     * 密码用MD5进行两次加密
     * @param vo
     * @return
     */
    public int regist(UserVO vo){
        User user = new User();
        BeanUtils.copyProperties(vo,user,"ucode");

        String code = vo.getUcodes();

        Digester md5 = new Digester(DigestAlgorithm.MD5);
        String pass = md5.digestHex(code);
        String result = md5.digestHex(pass);

        user.setUcode(result);
        int n = userDAO.insert(user);
        return n;
    }

    /**
     *用户登录
     * @param name
     * @param code
     * @return
     */
    public User login(String name,String code){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uname",name);


        Digester md5 = new Digester(DigestAlgorithm.MD5);
        String pass = md5.digestHex(code);
        String result = md5.digestHex(pass);

        queryWrapper.eq("ucode",result);
        User user = userDAO.selectOne(queryWrapper);
        return user;
    }

    /***
     * 用户详细信息
     * @param uid
     * @return
     */
    public User suser(int uid) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",uid);
        User user = userDAO.selectOne(queryWrapper);
        return user;

    }

    /***
     * 修改用户的余额
     * FilmActor里调用
     * @param uname
     * @param fear
     * @return
     */
    public int ufear(String uname,int fear) {
        User u = new User();
        u.setUfear(fear);
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("uname",uname);
        int n = userDAO.update(u,updateWrapper);
        return n;
    }



}
