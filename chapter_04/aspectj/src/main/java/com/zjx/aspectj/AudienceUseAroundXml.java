package com.zjx.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by zjx on 2018/6/15.
 */
public class AudienceUseAroundXml {

    public void watchPerformance(ProceedingJoinPoint jp){

        try {
            //表演之前手机静音
            System.out.println("silencing cell phones");
            //表演之前就做
            System.out.println("Taking seats");

            jp.proceed();

            //表演成功之后鼓掌
            System.out.println("CLAP CLAP CLAP!");
        } catch (Throwable e) {
            //表演失败则要求退钱
            System.out.println("Demanding refund");
        }
    }

}
