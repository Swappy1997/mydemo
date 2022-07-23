package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Controller2 {


    @RequestMapping("/")
    public String first(){
        return "Hello";
    }
    @RequestMapping("/app")
    public String second(){
        return "Helllooooo";
    }
}
