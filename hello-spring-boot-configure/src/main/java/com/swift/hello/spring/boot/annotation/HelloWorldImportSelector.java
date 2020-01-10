package com.swift.hello.spring.boot.annotation;

import com.swift.hello.spring.boot.configure.HelloWorldConfigure;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloWorldImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfigure.class.getName()};
    }
}
