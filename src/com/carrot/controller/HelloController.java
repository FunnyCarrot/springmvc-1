package com.carrot.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Created by carrot on 2018/1/29.
 */
public class HelloController implements Controller {


    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView view = new ModelAndView();
        view.addObject("message","Hello,springMVC!");
        view.setViewName("WEB-INF/content/welcome.jsp");
        return view;
    }
}
