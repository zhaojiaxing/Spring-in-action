package com.zjx.aspectj;

/**
 * Created by zjx on 2018/6/20.
 */
public class AudienceUseXml {
    //表演之前手机静音
    public void silenceCellPhones(){
        System.out.println("silencing cell phones");
    }

    //表演之前就做
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    //表演成功之后鼓掌
    public void applause(){
        System.out.println("CLAP CLAP CLAP!");
    }

    //表演失败则要求退钱
    public void demandRefund(){
        System.out.println("Demanding refund");
    }
}
