package com.yingxue.lesson.entity;

/**
 * @ClassName: Employee
 * @Description: TODO
 * @Date: 2020/4/24 9:03 下午
 * @Author: chris
 * @Version: 1.0
 */

public class Employee {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}