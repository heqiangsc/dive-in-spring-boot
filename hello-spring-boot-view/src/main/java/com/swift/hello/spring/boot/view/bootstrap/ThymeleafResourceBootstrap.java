package com.swift.hello.spring.boot.view.bootstrap;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThymeleafResourceBootstrap {

    public static void main(String[] args) throws IOException {
        //构建模板引擎
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();

        //设置上下文
        Context context = new Context();
        context.setVariable("message","hello world!");

        //classpath:/templates/hello-world.html
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/templates/thymeleaf/hello-world.html");
        File file = resource.getFile();
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        IOUtils.copy(inputStream, outputStream);

        String result = templateEngine.process(outputStream.toString("UTF-8"), context);

        System.out.println(result);

    }
}
