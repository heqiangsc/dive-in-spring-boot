package com.swift.hello.spring.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/")
    public String index(@RequestParam int abc) {
        return "index";
    }
}
