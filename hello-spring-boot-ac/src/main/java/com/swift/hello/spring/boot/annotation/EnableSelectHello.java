package com.swift.hello.spring.boot.annotation;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({HelloSeletor.class})
public @interface EnableSelectHello {

}
