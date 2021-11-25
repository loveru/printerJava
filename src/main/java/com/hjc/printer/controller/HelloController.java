package com.hjc.printer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/myIndex")
    public String index() {
        System.out.println("hello.springboot的第一个controller");
        return "index";
    }
}
