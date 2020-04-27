package com.yingxue.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return"Spring Initializr Demo";
    }


}
