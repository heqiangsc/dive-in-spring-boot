package com.swift.hello.spring.boot.webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.swift.hello.spring.boot.webmvc")
public class HelloSpringBootWebmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootWebmvcApplication.class, args);
    }

}
