package com.zjx.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by zjx on 2018/6/15.
 */
@Aspect
public class Audience {

    //表演之前手机静音
    @Before("execution(* com.zjx.aspectj.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("silencing cell phones");
    }

    //表演之前就做
    @Before("execution(* com.zjx.aspectj.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    //表演成功之后鼓掌
    @AfterReturning("execution(* com.zjx.aspectj.Performance.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!");
    }

    //表演失败则要求退钱
    @AfterThrowing("execution(* com.zjx.aspectj.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding refund");
    }

}
