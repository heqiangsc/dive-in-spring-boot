package com.swift.hello.spring.boot.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Profile("Java8")
@Service("call")
public class Java8Call implements Call {

    public int call(int... cc) {
        return Arrays.stream(cc).sum();
    }
}
