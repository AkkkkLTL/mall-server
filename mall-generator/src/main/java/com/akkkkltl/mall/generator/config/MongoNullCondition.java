package com.akkkkltl.mall.generator.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.lang.NonNull;


public class MongoNullCondition implements Condition {
    
    @Override
    public boolean matches(@NonNull ConditionContext context, @NonNull AnnotatedTypeMetadata metadata) {
        String database = context.getEnvironment().getProperty("renren.database");
        return !"mongodb".equalsIgnoreCase(database);
    }
}
