package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorld
public class ConfigrationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConfigrationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        context.close();
    }

}
