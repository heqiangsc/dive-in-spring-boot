package com.swift.hello.spring.boot.configuration;


import com.swift.hello.spring.boot.annotation.EnableHelloWorld;
import com.swift.hello.spring.boot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld
@ConditionalOnSystemProperty(name = "user.name", value = "ccc")
public class HelloWorldAutoConfiguration {

}
