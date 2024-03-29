package com.swift.hello.spring.boot.spring.application.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;


public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>, Ordered  {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("after helloworld: " + event.getApplicationContext().getId() + " , timestamp : " + event.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
