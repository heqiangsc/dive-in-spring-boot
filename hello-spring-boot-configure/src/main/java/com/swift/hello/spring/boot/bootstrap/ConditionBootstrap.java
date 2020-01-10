package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.condition.HelloWorldOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;

public class ConditionBootstrap {

    @Bean
    @HelloWorldOnSystemProperty(name = "user.name", value = "heqiang")
    public String helloWorld() {
        return "hello world ttt";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("hello world bean: " + helloWorld);
        context.close();
    }

}
