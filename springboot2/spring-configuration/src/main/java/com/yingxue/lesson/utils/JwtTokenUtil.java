package com.yingxue.lesson.utils;

import com.yingxue.lesson.entity.TokenSettings;

public class JwtTokenUtil {
    private static String secretKey;
    private static String issuer;
    public static void setTokenSettings(TokenSettings tokenSettings){
        secretKey=tokenSettings.getSecretKey();
        issuer=tokenSettings.getIssuer();
    }
    public static String getToken(){
        return secretKey+issuer;
    }
}
