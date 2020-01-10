package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.annotation.EnableHello;
import com.swift.hello.spring.boot.service.UserService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@EnableHello
public class EnableInterfaceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableInterfaceBootstrap.class).web(WebApplicationType.NONE).run(args);
        String hello = context.getBean("initConfig", String.class);
        System.out.println("hello: " + hello);
        context.close();
    }

}
