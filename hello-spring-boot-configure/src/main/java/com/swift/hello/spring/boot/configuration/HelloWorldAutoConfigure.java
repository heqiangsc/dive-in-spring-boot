package com.swift.hello.spring.boot.configuration;

import com.swift.hello.spring.boot.annotation.EnableHelloWorld;
import com.swift.hello.spring.boot.condition.HelloWorldOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld
@HelloWorldOnSystemProperty(name = "user.name", value = "heqiang")
public class HelloWorldAutoConfigure {

}
