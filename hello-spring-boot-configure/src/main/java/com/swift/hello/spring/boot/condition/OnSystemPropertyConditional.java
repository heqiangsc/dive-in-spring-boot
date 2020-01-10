package com.swift.hello.spring.boot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPropertyConditional implements Condition {


    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attrs = metadata.getAnnotationAttributes(HelloWorldOnSystemProperty.class.getName());
        String name = String.valueOf(attrs.get("name"));
        String value = String.valueOf(attrs.get("value"));
        String javaValue = System.getProperty(name);
        return javaValue.equals(value);
    }
}
