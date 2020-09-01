package com.ayang.cclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.math.RandomUtils;
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

    @HystrixCommand(fallbackMethod = "error")
    public String hello() {
        try {
            Thread.sleep(RandomUtils.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LocalDateTime.now().format(formatter) + "-----hello";
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(RandomUtils.nextInt(3000));
        }
    }


    public String error(){
        return "error";
    }

}
