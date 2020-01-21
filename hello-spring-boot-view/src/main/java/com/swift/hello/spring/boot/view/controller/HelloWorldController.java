package com.swift.hello.spring.boot.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";
    }
    @ModelAttribute("message")
    public String message() {
        return "Hello world";
    }
}
