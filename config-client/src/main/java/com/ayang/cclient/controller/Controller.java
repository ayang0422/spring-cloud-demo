package com.ayang.cclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Controller
 * @Author ayang
 * @Date 2020/8/28
 * @Version V1.0
 * @description
 **/
@RestController
public class Controller {

    @Value("${info.profile}")
    private String pro;

    @RequestMapping("/test")
    private String test(){
        System.out.println(pro);
        return pro;
    }



}
