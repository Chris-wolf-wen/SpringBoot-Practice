package com.yingxue.lesson.springinitializrdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Date: 2020/4/24 5:47 下午
 * @Author: chris
 * @Version: 1.0
 */

@RestController
@RequestMapping("/test")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Spring Initializr Demo";
    }
}