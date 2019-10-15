package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class PageController {
    public String testSpringmvc(){
        return "index";
    }
    @RequestMapping("{pageName}")
    public String testSpringmvc1(@PathVariable String pageName){
        return pageName;
    }
    @RequestMapping("{module}/{moduleUI}")
    public String doMenuUI(@PathVariable String moduleUI){
        return "sys/"+moduleUI;
    }
    @RequestMapping("doPageUI")
    public String doPageUI(){
        return "common/page";
    }
}


