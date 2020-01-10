package com.swift.hello.spring.boot.condition;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Profile("Java8")
@Service("add")
public class Java8Add implements Add {
    @Override
    public int add(int... aa) {
        return Arrays.stream(aa).sum();
    }
}
