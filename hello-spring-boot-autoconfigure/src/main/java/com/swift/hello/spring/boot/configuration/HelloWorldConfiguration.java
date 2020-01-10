package com.swift.hello.spring.boot.configuration;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "hello, world 2019";
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.name"));
    }
}
