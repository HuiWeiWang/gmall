package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

@Controller
public class DemoController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello Springboot";
    }
}
