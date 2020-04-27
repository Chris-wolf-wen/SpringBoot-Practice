//package com.yingxue.lesson.config;
//
//import com.yingxue.lesson.entity.Person;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class PersonConfig {
//    @Value("${person.username}")
//    private  String username;
//
//    @Value("${person.salary}")
//    private  double salary;
//
//    @Value("${person.age}")
//    private  int age;
//
//    @Value("${person.sex}")
//    private  String sex;
//
//    @Bean
//    public Person getPerson(){
//        Person person = new Person();
//        person.setSex(sex);
//        person.setAge(age);
//        person.getSalary(salary);
//        person.setUsername(username);
//        return person;
//    }
//
//}
