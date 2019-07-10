package com.action;

import com.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("actor")
@Controller
public class ActorAction {

    @Autowired
    private ActorService actorService;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/actor")
    public String allactor(){
        List list = actorService.allactor();
        System.out.println(list.get(3));
        request.setAttribute("list",list);
        return "/actor.jsp";
    }

}
