package com.yingxue.lesson.utils;

import com.yingxue.lesson.entity.TokenSettings;
import sun.tools.jstat.Token;

/**
 * @ClassName: JwtTokenUtil
 * @Description: TODO
 * @Date: 2020/4/25 9:38 下午
 * @Author: chris
 * @Version: 1.0
 */

public class JwtTokenUtil {
    private static String secretKey;
    private static String issuer;

    public static void setTonkenSettings(TokenSettings tonkenSettings) {
        secretKey = tonkenSettings.getSecretkey();
        issuer = tonkenSettings.getIssuer();
    }
    public static String getSecretKey() {
        return secretKey;
    }

    public static String getIssuer() {
        return issuer;
    }
}