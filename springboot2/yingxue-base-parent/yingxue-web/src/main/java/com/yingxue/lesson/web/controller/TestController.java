package com.yingxue.lesson.web.controller;

import com.yingxue.lesson.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserService userService;
    @GetMapping("/hello")
    public String hello(){
        return userService.testService();
    }
}
