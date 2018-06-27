package com.zjx.externals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by zjx on 2018/6/7.
 */
@Configuration
//@PropertySource("classpath:disc.properties") //声明属性源
public class BlankDiscConfig {

    @Bean
    public BlankDisc blankDisc(@Value("#{T(System).currentTimeMillis()}") String title, @Value("#{1}") String artist){
        return new BlankDisc(title,artist);
    }

    @Bean
    public BlankDisc blankDisc2(@Value("#{dreamDisc.title}") String title, @Value("#{1}") String artist){
        return new BlankDisc(title,artist);
    }

    @Bean
    @Primary
    public BlankDisc blankDisc3(@Value("#{systemProperties[disc.title]}") String title, @Value("#{1}") String artist){
        return new BlankDisc(title,artist);
    }

    @Bean
    public DreamDisc dreamDisc(){
        return new DreamDisc();
    }
}
