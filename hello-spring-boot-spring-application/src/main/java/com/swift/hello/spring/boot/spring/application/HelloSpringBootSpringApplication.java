package com.swift.hello.spring.boot.spring.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

//@SpringBootApplication
public class HelloSpringBootSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HelloSpringBootSpringApplication.class, args);
		Set<String> sources = new HashSet<>();
		sources.add(StartBootStrap.class.getName());
		SpringApplication springApplication = new SpringApplication();
		springApplication.setSources(sources);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext context = springApplication.run(args);


		StartBootStrap springApplicationBean = context.getBean(StartBootStrap.class);
		System.out.println("Bean: "+ springApplicationBean);
	}

	@SpringBootApplication
	public static class StartBootStrap {

	}

}
