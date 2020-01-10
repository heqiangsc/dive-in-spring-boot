package com.swift.hello.spring.boot.annotation;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWorldcConfigure.class) 非条件装配
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
