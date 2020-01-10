package com.swfit.hello.spring.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan(basePackages = "com.swfit.hello.spring.boot.web.servlet")
@SpringBootApplication
public class HelloSpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootWebApplication.class, args);
	}

}
