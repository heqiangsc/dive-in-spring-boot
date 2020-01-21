package com.swift.hello.spring.boot.view.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.swift.hello.spring.boot.view")
public class ThymeleafBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafBootstrap.class, args);
    }
}
