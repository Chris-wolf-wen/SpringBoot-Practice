package com.yingxue.lesson.springinitializrdemo;

import com.yingxue.lesson.springinitializrdemo.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringInitializrDemoApplicationTests {
    private final Logger logger =  LoggerFactory.getLogger(HelloController.class);
    @Test
    void contextLoads() {
    }

    @Test
    public void test1() {
        logger.debug("debug....");
        logger.info("info...");
        logger.error("error...");
        logger.warn("warn...");
        logger.trace("trace...");
    }

}
