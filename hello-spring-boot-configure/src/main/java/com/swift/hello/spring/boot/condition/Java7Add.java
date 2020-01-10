package com.swift.hello.spring.boot.condition;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Java7")
@Service("add")
public class Java7Add implements Add {
    @Override
    public int add(int... aa) {
        int sum = 0;
        for (int a : aa) {
            sum += a;
        }
        return sum;
    }
}
