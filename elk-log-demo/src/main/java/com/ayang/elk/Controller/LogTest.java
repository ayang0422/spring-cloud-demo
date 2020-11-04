package com.ayang.elk.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LogTest
 * @Author ayang
 * @Date 2020/9/28
 * @Version V1.0
 * @description
 **/
@RestController
@RequestMapping("/test")
@Slf4j
public class LogTest {

    private long count;


    @RequestMapping("/testLog")
    public String testLog() {
        log.info("测试elk日志----{}", count++);
        return "ok";
    }
}
