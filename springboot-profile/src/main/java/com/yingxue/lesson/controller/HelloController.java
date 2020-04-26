package com.yingxue.lesson.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: TODO
 * @Date: 2020/4/25 10:28 下午
 * @Author: chris
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @Value("${branch}")
    private String branch;

    @GetMapping("/branch")
    private String test() {
        return "springboot current branch   " + branch;
    }
}