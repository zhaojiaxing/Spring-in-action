package com.zjx.aspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by zjx on 2018/6/18.
 */
@EnableAspectJAutoProxy //启用AspectJ自动代理
@Configuration //声明一个配置类
@ComponentScan //启用Spring自动扫描
public class ConcertConfig {

    //声明Audience bean
    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer(){
        return new EncoreableIntroducer();
    }

}
