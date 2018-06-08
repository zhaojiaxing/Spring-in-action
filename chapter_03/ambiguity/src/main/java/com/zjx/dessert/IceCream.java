package com.zjx.dessert;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by zjx on 2018/6/5.
 */
@Component
@Primary
@Qualifier("ice")
@Cold
public class IceCream implements Dessert {

    @Bean
    @Primary
    public Dessert iceCream(){
        return new IceCream();
    }
}
