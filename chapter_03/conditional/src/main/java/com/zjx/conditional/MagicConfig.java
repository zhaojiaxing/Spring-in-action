package com.zjx.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zjx on 2018/6/5.
 */
@Configuration
public class MagicConfig {

    @Bean
    @Conditional(MagicExistConditional.class)
    public MagicBean getBean(){
        return new MagicBean();
    }

}
