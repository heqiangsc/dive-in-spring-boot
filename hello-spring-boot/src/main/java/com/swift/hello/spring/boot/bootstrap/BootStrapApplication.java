package com.swift.hello.spring.boot.bootstrap;


import com.swift.hello.spring.boot.repository.UserRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.swift.hello.spring.boot")
public class BootStrapApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(BootStrapApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        UserRepository repository = context.getBean("userRepository", UserRepository.class);
        System.out.println("userRepository:" + repository);
        context.close();

    }
}
