package com.ayang.cclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName HelloController
 * @Author ayang
 * @Date 2020/8/26
 * @Version V1.0
 * @description
 **/
@RestController
public class HelloController {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @RequestMapping("/hello")
    public String hello(){
        return LocalDateTime.now().format(formatter) + "-----hello";
    }
}
