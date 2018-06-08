package com.zjx.dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by zjx on 2018/6/5.
 */
public class People {
    private Dessert dessert;

    @Autowired
    @Qualifier("iceCream")
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }
}
