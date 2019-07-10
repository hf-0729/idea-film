package com.action;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import cn.hutool.core.io.FileUtil;
import com.pojo.*;
import com.service.FilmService;
import com.service.LishiService;
import com.service.ScService;
import com.vo.LishiVO;
import com.vo.ScVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.UserService;
import com.vo.UserVO;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.*;

@RequestMapping("/user")
@Controller
public class UserAction {

    /**
     *
     */
    @Autowired
    private UserService userService;
    @Autowired
    private LishiService lishiService;
    @Autowired
    private FilmService filmService;
    @Autowired
    private ScService scService;

    @Autowired
    private HttpServletRequest request;

    /***
     * 用户注册
     * @param vo
     * @param img
     * @return
     */
    @RequestMapping("/regist")
    public String regist(UserVO vo,String img){
        //file="/tmp/54564561.png"
        String srcpath = System.getProperty("ROOT")+img;
        String despath = System.getProperty("ROOT")+"/image";
        System.out.println(vo.getUname());
        File despathfile = new File(despath);
        if (despathfile.exists()==false){
            despathfile.mkdirs();
        }

        //复制文件
        FileUtil.copy(srcpath,despath,true);
        String newpath = "/image"+img.substring(4);
        vo.setImg(newpath);

        userService.regist(vo);

        return "/login.jsp";
    }

    /***
     * 生成验证码
     * 登陆时使用
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/yzm")
    public void yzm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //定义图形验证码的长、宽、验证码字符数、干扰线宽度
        ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(100, 30, 4, 5);
        request.getSession().setAttribute("yzm",captcha.getCode());
        captcha.write(response.getOutputStream());
    }

    /***
     * 用户登录
     * 登录失败仍在登录界面
     * 登录成功后进入主页面（暂时）
     * @param uname
     * @param ucode
     * @param yzm
     * @return
     */
    @RequestMapping("/login")
    public String login(String uname,String ucode,String yzm){

        String nyzm = (String)request.getSession().getAttribute("yzm");
        if (nyzm.equalsIgnoreCase(yzm)==false)   {
            request.getSession().setAttribute("msg","验证码失败！");
            return "/login.jsp";
        }

        User user =  userService.login(uname,ucode);
        if (user==null){
            request.getSession().setAttribute("msg","用户名或密码失败！");
            return "/login.jsp" ;
        }
        request.getSession().setAttribute("name",uname);
        request.getSession().setAttribute("uid",user.getId());
        return "/film/findallfilm";
    }

    /***
     * 用户详细信息
     * @return
     */
    @RequestMapping("/suser")
    public String user(){
        int uid = (int) request.getSession().getAttribute("uid");
        User user = userService.suser(uid);
        request.setAttribute("user",user);
        return "/user.jsp";
    }

    /***
     * 用户详细信息
     * @return
     */
    @RequestMapping("/uu")
    public User uu(){
        int uid = (int) request.getSession().getAttribute("uid");
        User user = userService.suser(uid);
        request.setAttribute("user",user);
        return user;
    }

    /***
     * 查看用户的历史纪录
     * @return
     */
    @RequestMapping("/history")
    public String uhistory(){
        int uid = (int) request.getSession().getAttribute("uid");
        List user = lishiService.shistory(uid);

        Map map = new HashMap();
        List list = new ArrayList();
        LishiVO vo = new LishiVO();

        for (int i=0;i<user.size();i++){
            Lishi lishi = (Lishi) user.get(i);
            int fid = lishi.getFid();
            Film film = filmService.fname(fid);

            vo.setUid(lishi.getUid());
            vo.setFid(lishi.getFid());
            vo.setDate(lishi.getDate());
            vo.setFilmname(film.getFilmname());
            list.add(vo);
        }
        map.put("key",list);
        request.setAttribute("uhistory",map);
        return "/uhistory.jsp";
    }

    /***
     * 用户收藏电影
     * @param fid
     * @return
     */
    @RequestMapping("/collection")
    public String collection(int fid){
        int uid = (int) request.getSession().getAttribute("uid");
        Date date = new Date(new java.util.Date().getTime());
        int n = scService.collection(uid,fid,date);
        return "sussecc";
    }

    @RequestMapping("/mysc")
    public String mysc(){
        int uid = (int) request.getSession().getAttribute("uid");
        List sc = scService.select(uid);
        List list = new ArrayList();
        Map map = new HashMap();
        ScVO vo = new ScVO();

        for (int i=0;i<sc.size();i++){
            Sc nsc = (Sc) sc.get(i);
            int fid = nsc.getFid();
            Film film = filmService.fname(fid);

            vo.setUid(nsc.getUid());
            vo.setFid(fid);
            vo.setDate(nsc.getDate());
            vo.setFname(film.getFilmname());

            list.add(vo);
        }
        map.put("key",list);
        request.setAttribute("musc",map);
        return "/collection.jsp";
    }

}
