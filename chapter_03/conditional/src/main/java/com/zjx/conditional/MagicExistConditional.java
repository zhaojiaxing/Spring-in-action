package com.zjx.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by zjx on 2018/6/5.
 */
public class MagicExistConditional implements Condition{

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        org.springframework.core.env.Environment env = context.getEnvironment();
        return env.containsProperty("magic");
    }
}
