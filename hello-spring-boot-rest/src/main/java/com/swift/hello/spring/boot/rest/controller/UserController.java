package com.swift.hello.spring.boot.rest.controller;

import com.swift.hello.spring.boot.rest.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {


    @PostMapping(value = "/user",
            consumes = "application/json;charset=UTF-8", //request
            produces = "application/json;charset=UTF-8") //response    Content-Type 过滤媒体类型
    public User user(@RequestBody User user) {
        return user;
    }
}
