package com.swift.hello.spring.boot.configuration;

import com.swift.hello.spring.boot.annotation.EnableSelectHello;
import com.swift.hello.spring.boot.condition.HelloConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@EnableSelectHello
@Configuration
@HelloConditionOnSystemProperty(name = "user.name", value = "heqiang")
public class UserAutoConfiguration {

}
