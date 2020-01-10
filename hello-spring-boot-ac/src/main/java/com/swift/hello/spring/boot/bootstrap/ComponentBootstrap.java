package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.service.UserService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.swift.hello.spring.boot.service")
public class ComponentBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ComponentBootstrap.class).web(WebApplicationType.NONE).run(args);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println("userService: " + userService);
        context.close();
    }

}
