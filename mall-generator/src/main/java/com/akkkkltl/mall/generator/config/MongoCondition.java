package com.akkkkltl.mall.generator.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.lang.NonNull;

public class MongoCondition implements Condition {
    @Override
    public boolean matches(@NonNull ConditionContext context, @NonNull AnnotatedTypeMetadata metadata) {
        // Logic to determine if MongoDB is enabled
        String mongoEnabled = context.getEnvironment().getProperty("spring.data.mongodb.enabled");
        return "true".equalsIgnoreCase(mongoEnabled);
    }
}
