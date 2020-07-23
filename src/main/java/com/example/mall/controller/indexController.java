package com.example.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {
    @RequestMapping(path={"/index","/"})
    @ResponseBody
    public String index(){
        return "Hello World";
    }
}