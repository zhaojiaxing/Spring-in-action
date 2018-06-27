package com.zjx.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zjx on 2018/6/15.
 */
@Aspect
public class AudienceUseAround {

    @Pointcut("execution(* com.zjx.aspectj.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
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
