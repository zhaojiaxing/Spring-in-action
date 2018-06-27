package com.zjx.aspectj;

import org.springframework.stereotype.Component;

/**
 * Created by zjx on 2018/6/20.
 */
@Component
public class PerformanceBean implements Performance {
    @Override
    public void perform() {
        System.out.println("表演中。。。");
    }
}
