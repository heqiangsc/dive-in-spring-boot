package com.swift.hello.spring.boot.annotation;


import com.swift.hello.spring.boot.configuration.UserConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({UserConfiguration.class})
public @interface EnableHello {

}
