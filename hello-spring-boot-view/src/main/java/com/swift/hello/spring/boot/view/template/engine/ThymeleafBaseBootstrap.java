package com.swift.hello.spring.boot.view.template.engine;

import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

public class ThymeleafBaseBootstrap {

    public static void main(String[] args) {
        //构建模板引擎
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();

        //设置上下文
        Context context = new Context();
        context.setVariable("message","hello world!");

        String template = "<p th:text=\"${message}\">!!!</p>";

        String result = templateEngine.process(template, context);

        System.out.println(result);

    }
}
