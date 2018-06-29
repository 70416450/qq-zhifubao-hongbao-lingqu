package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Created by Heaton on 2018/6/28.
 * @describe X
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "templates/hello.html";
    }
    @RequestMapping("/tzy")
    public String hello2() {
        return "templates/hello2.html";
    }
    @RequestMapping("/tzy1")
    public String hello3() {
        return "templates/hello3.html";
    }


}
