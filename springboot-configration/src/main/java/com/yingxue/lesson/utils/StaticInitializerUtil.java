package com.yingxue.lesson.utils;

import com.yingxue.lesson.entity.TokenSettings;
import org.springframework.stereotype.Component;

/**
 * @ClassName: StaticInitializerUtil
 * @Description: TODO
 * @Date: 2020/4/25 9:42 下午
 * @Author: chris
 * @Version: 1.0
 */

@Component
public class StaticInitializerUtil {
    private TokenSettings tokenSettings;

    public StaticInitializerUtil(TokenSettings tokenSettings) {
        JwtTokenUtil.setTonkenSettings(tokenSettings);
    }
}