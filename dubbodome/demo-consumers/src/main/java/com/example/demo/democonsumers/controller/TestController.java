package com.example.demo.democonsumers.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.api.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class TestController {

    @Reference
    private  Test test;

    @RequestMapping(value = "/insertTableUp", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
    public String branch() {
        System.out.println("-----dubbo服务测试方法-----");
        return test.onetest();
    }
}
