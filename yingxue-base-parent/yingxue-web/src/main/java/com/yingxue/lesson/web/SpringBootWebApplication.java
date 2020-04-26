package com.yingxue.lesson.web;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: SpringBootWebApplication
 * @Description: TODO
 * @Date: 2020/4/24 6:29 下午
 * @Author: chris
 * @Version: 1.0
 */

@SpringBootApplication(scanBasePackages = "com.yingxue.lesson")
public class SpringBootWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class,args);
    }
}