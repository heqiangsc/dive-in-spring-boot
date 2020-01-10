package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.condition.HelloConditionOnSystemProperty;
import com.swift.hello.spring.boot.profile.Call;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class ConditionBootstrap {

    @Bean
    @HelloConditionOnSystemProperty(name = "user.name", value = "heqiang")
    public String sayHello() {
        return "hello, " + "123";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String hello = context.getBean("sayHello", String.class);
        System.out.println("hello: " + hello);

        context.close();
    }

}
