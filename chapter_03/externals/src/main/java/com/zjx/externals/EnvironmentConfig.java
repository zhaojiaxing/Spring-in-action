package com.zjx.externals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by zjx on 2018/6/6.
 */
@Configuration
@PropertySource("classpath:disc.properties") //声明属性源
public class EnvironmentConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc disc(){
        return new BlankDisc(
                env.getProperty("disc.title"),
                env.getProperty("disc.artist"));
    }
}
