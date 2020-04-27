package com.yingxue.lesson.service.impl;

import com.yingxue.lesson.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String testService(){
        return  "TestService";
    }

}
