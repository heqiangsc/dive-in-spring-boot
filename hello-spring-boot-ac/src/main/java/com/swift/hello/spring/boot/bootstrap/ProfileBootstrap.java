package com.swift.hello.spring.boot.bootstrap;

import com.swift.hello.spring.boot.profile.Call;
import com.swift.hello.spring.boot.service.UserService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.swift.hello.spring.boot.profile")
public class ProfileBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ProfileBootstrap.class).profiles("Java8").web(WebApplicationType.NONE).run(args);
        Call call = context.getBean("call", Call.class);
        System.out.println("call: " + call + call.call(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        context.close();
    }

}
