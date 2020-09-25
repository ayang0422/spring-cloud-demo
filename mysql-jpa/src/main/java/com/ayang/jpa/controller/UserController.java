package com.ayang.jpa.controller;

import com.ayang.jpa.UserVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Author ayang
 * @Date 2020/9/24
 * @Version V1.0
 * @description
 **/
@RestController
@RequestMapping("user")
public class UserController {


    public void saveUser(@RequestBody UserVo userVo){

    }

}
