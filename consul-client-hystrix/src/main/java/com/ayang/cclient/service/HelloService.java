package com.ayang.cclient.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName HelloService
 * @Author ayang
 * @Date 2020/8/30
 * @Version V1.0
 * @description
 **/
@Service
public class HelloService {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public String hello() {
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LocalDateTime.now().format(formatter) + "-----hello";
    }

}
