package com.example.demo.demoproducer.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.api.Test;

@Service
public class TestImpl implements Test {

    public String onetest() {
         System.out.println("cs");
        return "cs";
    }
}
