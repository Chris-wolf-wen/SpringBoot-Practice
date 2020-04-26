//package com.yingxue.lesson.config;
//
//import com.yingxue.lesson.entity.Person;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @ClassName: PersonConfig
// * @Description: TODO
// * @Date: 2020/4/24 8:19 下午
// * @Author: chris
// * @Version: 1.0
// */
//@Configuration
//public class PersonConfig {
//    @Value("${person.username}")
//    private String username;
//
//    @Value("${person.salary}")
//    private Double salary;
//
//    @Value("${person.age}")
//    private int age;
//
//    @Value("${person.sex}")
//    private String sex;
//
//
//
//    @Bean
//    public Person getPerson() {
//        Person person = new Person();
//        person.setAge(age);
//        person.setSalary(salary);
//        person.setSex(sex);
//        person.setUsername(username);
//        return person;
//    }
//}