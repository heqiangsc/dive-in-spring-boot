package com.swift.hello.spring.boot.service;

import com.swift.hello.spring.boot.annotation.FirstLevelService;

@FirstLevelService("userService")
public class UserService {

    public String sayHello(String name) {
        return "hello, " + name;
    }

}
