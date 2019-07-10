package com.action;

import com.pojo.Actor;
import com.pojo.Director;
import com.service.ActorService;
import com.service.DirectorService;
import com.service.FilmService;
import com.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/search")
@Controller
public class SearchAction {
    @Autowired
    private SearchService searchService;
    @Autowired
    private FilmService filmService;
    @Autowired
    private ActorService actorService;
    @Autowired
    private DirectorService directorService;
    @Autowired
    private HttpServletRequest request;

    @PostMapping("/likesearch")
    public String search(String s){
        System.out.println(s);
        List film = filmService.likesearch(s);
        List actor = actorService.likesearch(s);
        List director = directorService.likesearch(s);
        Map map = new HashMap();
        map.put("film",film);
        map.put("actor",actor);
        map.put("director",director);
        System.out.println(map.toString());

//        if (film==null & actor==null & director==null){
//            List film2 = filmService.randsearch();
//            request.setAttribute("rand",film2);
//            return "search.jsp";
//        }

//        if (film != null | actor != null | director != null){
//            System.out.println(2);
//            request.setAttribute("result",map);
//            return "login.jsp";
//        }
        return "false";
    }
}
