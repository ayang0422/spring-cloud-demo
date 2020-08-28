package com.ayang.rconsumer.controller;

import com.ayang.api.HelloApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName TestController
 * @Author ayang
 * @Date 2020/8/26
 * @Version V1.0
 * @description
 **/
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private HelloApi helloApi;

    @RequestMapping("testHello")
    public String testHello(){
        return restTemplate.getForObject("http://consul-client/hello",String.class);
    }


    @RequestMapping("testHelloByFeign")
    public String testHelloByFeign(){
        return helloApi.testHello();
    }
}
