package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.condition.Add;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.swift.hello.spring.boot.condition")
public class ProfileBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ProfileBootstrap.class)
                .profiles("Java8")
                .web(WebApplicationType.NONE)
                .run(args);

        Add add = context.getBean("add", Add.class);

        System.out.println(add.add(1,2,3,4,5,6,7,8,9));

        context.close();
    }

}
