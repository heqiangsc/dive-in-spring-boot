package com.swift.hello.spring.boot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyConditional.class)
public @interface HelloWorldOnSystemProperty {

    String name() default "";

    String value() default "";
}
