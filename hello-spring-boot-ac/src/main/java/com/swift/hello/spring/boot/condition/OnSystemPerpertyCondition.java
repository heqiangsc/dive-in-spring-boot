package com.swift.hello.spring.boot.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPerpertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attrs = metadata.getAnnotationAttributes(HelloConditionOnSystemProperty.class.getName());
        String name = attrs.get("name") + "";
        String val = attrs.get("value") + "";
        String javaValue = System.getProperty(name);
        return javaValue.equals(val);
    }
}
