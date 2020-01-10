package com.swift.hello.spring.boot.condition;


import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPerpertyCondition.class)
public @interface HelloConditionOnSystemProperty {

     String name() default "";

     String value()  default "";
}
