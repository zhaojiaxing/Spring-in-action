package com.zjx.aspectj;

/**
 * Created by zjx on 2018/6/20.
 */
public class DefaultEncoreable implements Encoreable {
    @Override
    public void performance() {
        System.out.println("这是新加的方法");
    }
}
