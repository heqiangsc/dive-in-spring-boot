package com.swift.hello.spring.boot.configuration;

import org.springframework.context.annotation.Bean;

public class UserConfiguration {


    @Bean
    public String initConfig() {
       return "hello, 1233";
    }

}
