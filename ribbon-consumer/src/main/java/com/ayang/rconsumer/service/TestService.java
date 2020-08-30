package com.ayang.rconsumer.service;

import com.ayang.api.HelloApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName TestService
 * @Author ayang
 * @Date 2020/8/30
 * @Version V1.0
 * @description
 **/
@Service
public class TestService {

    @Resource
    private HelloApi helloApi;

    @HystrixCommand(fallbackMethod = "fallback")
    public String testHelloByFeign(){
        return helloApi.testHello();
    }

    public String fallback() {
        return "fallback";
    }
}
