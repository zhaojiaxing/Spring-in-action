package com.zjx.aspectj;

import org.aspectj.lang.annotation.*;

/**
 * Created by zjx on 2018/6/15.
 */
@Aspect
public class AudienceUsePointCut {

    @Pointcut("execution(* com.zjx.aspectj.Performance.perform(..))")
    public void performance(){}

    //表演之前手机静音
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("silencing cell phones");
    }

    //表演之前就做
    @Before("performance())")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    //表演成功之后鼓掌
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!");
    }

    //表演失败则要求退钱
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding refund");
    }

}
