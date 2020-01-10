package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.annotation.EnableSelectHello;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@EnableSelectHello
public class EnableSelectBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableSelectBootstrap.class).web(WebApplicationType.NONE).run(args);

        String hello = context.getBean("initConfig", String.class);
        System.out.println("hello: " + hello);
        context.close();
    }

}
