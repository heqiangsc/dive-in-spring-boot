package com.swift.hello.spring.boot.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Java7")
@Service("call")
public class Java7Call implements Call {

    public int call(int... cc) {
        int sum = 0;
        for (int c : cc) {
            sum += c;
        }
        return sum;
    }
}
