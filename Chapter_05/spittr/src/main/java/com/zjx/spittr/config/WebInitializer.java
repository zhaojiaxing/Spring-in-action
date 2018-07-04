package com.zjx.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by zjx on 2018/6/28.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    //指定配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    //将DispatcherServlet映射到"/"
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
