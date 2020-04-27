package com.yingxue.lesson.utils;

import com.yingxue.lesson.entity.TokenSettings;
import org.springframework.stereotype.Component;

@Component
public class StaticInitializerUtil {
    private TokenSettings tokenSettings;
    public StaticInitializerUtil(TokenSettings tokenSettings) {
        JwtTokenUtil.setTokenSettings(tokenSettings);
    }
}
