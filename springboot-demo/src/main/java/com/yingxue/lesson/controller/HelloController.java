package com.yingxue.lesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**

* @Description:    java类作用描述

* @Author:         chris

* @UpdateDate:     2020/4/24 5:27 下午

* @Version:        1.0

*/
@RestController
@RequestMapping("/test")
public class HelloController {
//    public static final logger 
    @GetMapping("/hello")
    public String hell() {
//        logger.debug()
//                logger.error()
//                logger.info()
//                        
        return "Hello World";
    }
}