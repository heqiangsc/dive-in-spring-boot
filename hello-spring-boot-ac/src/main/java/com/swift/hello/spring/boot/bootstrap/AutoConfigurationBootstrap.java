package com.swift.hello.spring.boot.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class AutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(AutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String hello = context.getBean("initConfig", String.class);
        System.out.println("hello: " + hello);

        context.close();
    }

}
