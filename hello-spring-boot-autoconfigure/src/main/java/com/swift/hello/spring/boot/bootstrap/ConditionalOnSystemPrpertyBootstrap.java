package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class ConditionalOnSystemPrpertyBootstrap {


    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "heqiang")
    public String helloWorld() {
        return "hello, world ccccc";
    }

    ;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPrpertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("hello world bean: " + helloWorld);
        context.close();
    }
}
