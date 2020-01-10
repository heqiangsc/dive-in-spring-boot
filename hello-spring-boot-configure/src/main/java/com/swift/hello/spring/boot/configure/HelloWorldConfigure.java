package com.swift.hello.spring.boot.configure;

import com.swift.hello.spring.boot.condition.HelloWorldOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
@HelloWorldOnSystemProperty(name = "user.name", value="heqiang")
public class HelloWorldConfigure {

    @Bean
    public String helloWorld() {
        return "hello world 2020";
    }

}
