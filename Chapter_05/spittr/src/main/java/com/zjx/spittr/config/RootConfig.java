package com.zjx.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zjx on 2018/6/28.
 */
@Configuration
@ComponentScan(basePackages = {"com.zjx.spittr"},
    excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
    })
public class RootConfig {

}
