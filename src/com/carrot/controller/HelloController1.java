package com.carrot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by carrot on 2018/1/29.
 */

@Controller
public class HelloController1{

    @RequestMapping(value = "/hello1")
    public ModelAndView hello(){
        ModelAndView view = new ModelAndView();
        view.addObject("message","Hello,springMVC!");
        view.setViewName("WEB-INF/content/welcome.jsp");
        return view;
    }
}
