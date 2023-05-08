package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ControllerSeed {
    @RequestMapping("/mj")
    @ResponseBody
    public ModelAndView seed(){
        ModelAndView mav =new ModelAndView();
        mav.setViewName("mj.html");
        return mav;
//        return "hello world!";
//        int [][] one = new int[2][3];
    }
    @RequestMapping("/one")
    @ResponseBody
    public ModelAndView seed_two(){
        ModelAndView mav =new ModelAndView();
        mav.setViewName("one.html");
        return mav;
//        return "hello world!";
//        int [][] one = new int[2][3];
    }

}
