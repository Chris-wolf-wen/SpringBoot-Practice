package com.yingxue.lesson;

import com.yingxue.lesson.entity.Person;
import com.yingxue.lesson.utils.JwtTokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootConfigrationApplicationTests {

    @Autowired
    private Person person;
    @Test
    public void contextLoads() {
    }

    @Test
    public void TestPerson() {
        System.out.println(person.toString());
    }

    @Test
    public void testStaticUtil() {
        System.out.println("secretKey=" + JwtTokenUtil.getSecretKey());
        System.out.println("issuer="+JwtTokenUtil.getIssuer());
    }



}
