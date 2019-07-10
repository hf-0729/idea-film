package com.action;


import com.pojo.Actor;
import com.pojo.Film;
import com.pojo.User;
import com.service.FilmService;
import com.service.MyorderService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import static java.lang.System.out;

@RequestMapping("/film")
@Controller
public class FilmAction {

    @Autowired
    private FilmService filmService;
    @Autowired
    private UserService userService;
    @Autowired
    private MyorderService myorderService;
    @Autowired
    private HttpServletRequest request;

    /***
     * 查找所有电影
     * @return
     */
    @RequestMapping("/findallfilm")
    public String findAllFilm(){
        List list = filmService.findAllFilm();
        request.setAttribute("list",list);
        return "/main.jsp";
    }

    /***
     * 根据电影类型查找电影
     * @param typeid
     * @return
     */
    @RequestMapping("/filmbytype")
    public String FilmType(Integer typeid){
        out.println(typeid);
        List list = filmService.FilmType(typeid);
        request.setAttribute("typefilm",list);
        return "/filmstyle.jsp";
    }

    /***
     * 电影详情
     * @param fid
     * @return
     */
    @RequestMapping("/ifilm")
    public String ifilm(int fid) {
        Film film = filmService.ifilm(fid);
        request.setAttribute("list", film);
        return "/ifilm.jsp";
    }

    /***
     * 电影排行榜
     * @return
     */
    @RequestMapping("/click")
    public String onclick() {
        String uname = (String) request.getSession().getAttribute("name");
        if (uname == null) {
            return "/login.jsp";
        } else {
            List list = filmService.click();
            request.setAttribute("list", list);
            return "/click.jsp";
        }
    }

    /***
     * view 点击观看电影
     * 需用户先登录
     * @param fid
     * @return
     * @throws ParseException
     */
    @RequestMapping("/view")
    public String view(int fid) throws ParseException {

        Film f = filmService.ifilm(fid);
        request.setAttribute("f",f);
//        if (f.getVipfilm()==1){
//            if (u.getVip()==1){
//                return "/view.jsp";
//            }
//        }
//        if (f.getBuyfilm()*1==1){
//            int x = f.getPrice();
//            int y = u.getUfear();
//            if (y > x) {
//                int d = y - x;
//                int t = userService.ufear(uname, d);
//                if (t == 1) {
//                    Date date = new Date(new java.util.Date().getTime());
//                    boolean g = myorderService.order(1, uname, fid, date, x);
//                    out.println(4);
//                    return "/view.jsp";
//                }
//                return "/view.jsp";
//            }
//        }
        return "/view.jsp";
    }




}
