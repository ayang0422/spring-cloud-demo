package com.ayang.cclient.controller;

import com.ayang.cclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author ayang
 * @Date 2020/8/26
 * @Version V1.0
 * @description
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;



    @RequestMapping("/hello")
    public String hello(){
        return helloService.hello();
    }
}
