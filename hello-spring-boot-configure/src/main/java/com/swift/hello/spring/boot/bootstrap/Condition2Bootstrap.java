package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.swift.hello.spring.boot.configure")
public class Condition2Bootstrap {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Condition2Bootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("hello world bean: " + helloWorld);
        context.close();
    }

}
