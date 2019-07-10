package com.action;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import com.pojo.Admin;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping("/admin")
@Controller
public class AdminAction {

    @Autowired
    private AdminService adminService;

    @Autowired
    private HttpServletRequest request;

    @PostMapping("/yzm")
    public void yzm(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //定义图形验证码的长、宽、验证码字符数、干扰元素个数
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(100, 30, 4, 20);
        request.getSession().setAttribute("yzm", captcha.getCode());
        captcha.write(response.getOutputStream());
    }

    @PostMapping("/login")
    public String login(String username, String password, String yzm) {
        String nyzm = (String) request.getSession().getAttribute("yzm");
        if (nyzm.equalsIgnoreCase(yzm) == false) {
            request.getSession().setAttribute("msg", "验证码失败！");
            return "/alogin.jsp";
        }

        Admin admin = adminService.login(username, password);
        if (admin == null) {
            request.getSession().setAttribute("msg", "用户名或密码失败！");
            return "/alogin.jsp";
        }


        return "/amain.jsp";

    }
}
