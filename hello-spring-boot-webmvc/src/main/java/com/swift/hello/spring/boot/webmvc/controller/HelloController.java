package com.swift.hello.spring.boot.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
