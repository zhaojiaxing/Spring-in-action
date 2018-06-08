package com.zjx.dessert;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by zjx on 2018/6/5.
 */
@Component
@Scope(value=WebA)
public class Cookie implements Dessert {
}
