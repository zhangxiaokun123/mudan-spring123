package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/a")
    public String testSpringmvc(){
        return "index";
    }
    @RequestMapping("/{pageName}")
    public String testSpringmvc1(@PathVariable String pageName){
        return pageName;
    }
}
