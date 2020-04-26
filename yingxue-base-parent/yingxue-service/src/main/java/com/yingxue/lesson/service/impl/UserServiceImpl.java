package com.yingxue.lesson.service.impl;

import com.yingxue.lesson.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Date: 2020/4/24 6:26 下午
 * @Author: chris
 * @Version: 1.0
 */
@Service

public class UserServiceImpl implements UserService {
    @Override
    public String testService() {
        return "testService";
    }
}