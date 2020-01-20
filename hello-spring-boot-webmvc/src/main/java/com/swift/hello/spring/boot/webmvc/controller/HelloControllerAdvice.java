package com.swift.hello.spring.boot.webmvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



/**
 * 通知
 *
 */
@ControllerAdvice
public class HelloControllerAdvice {

   @ModelAttribute("message")
    public String message() {
        return "hello, world";
    }

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage) {
        return acceptLanguage;
    }

    @ModelAttribute("jsessionId")
    public String jsessionId(@CookieValue(value = "JSESSIONID") String jsessionId) {
        return jsessionId;
    }


    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> onException(Throwable throwable) {
        return ResponseEntity.ok(throwable.getMessage());
    }
}
