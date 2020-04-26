package com.yingxue.lesson.springinitializrdemo;

import com.yingxue.lesson.springinitializrdemo.controller.HelloController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class SpringInitializrDemoApplication {


    public static void main(String[] args) {
         final Logger logger =  LoggerFactory.getLogger(HelloController.class);
        logger.debug("debug....");
        logger.info("info...");
        logger.error("error...");
        logger.warn("warn...");
        logger.trace("trace...");
        SpringApplication.run(SpringInitializrDemoApplication.class, args);

    }

}
