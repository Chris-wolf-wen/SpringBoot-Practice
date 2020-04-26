package com.yingxue.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @Date: 2020/4/26 12:14 上午
 * @Author: chris
 * @Version: 1.0
 */

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/devtools")
    public String test() {
        return "Hello";
    }
}