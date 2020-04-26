package com.yingxue.lesson.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: TokenSettings
 * @Description: TODO
 * @Date: 2020/4/25 9:36 下午
 * @Author: chris
 * @Version: 1.0
 */
@Configuration
@ConfigurationProperties(prefix = "jwt")
@Data
public class TokenSettings {
    private String secretkey;
    private String issuer;

    public String getSecretkey() {
        return secretkey;
    }

    public String getIssuer() {
        return issuer;
    }
}