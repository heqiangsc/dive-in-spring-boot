package com.swift.hello.spring.boot.spring.application.bootstrap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.addApplicationListener(event ->{
            System.out.println("监听到事件: " + event);
        });

        context.refresh();

        // 发送事件
        context.publishEvent("HelloWorld");
        context.close();
    }
}
