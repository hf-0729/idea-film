package com.action;

import com.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/type")
@Controller
public class TypeAction {

    @Autowired
    private TypeService typeService;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/types")
    public String allType(){
        List list = typeService.allType();
        request.setAttribute("list",list);
        return "/types.jsp";
    }

}
