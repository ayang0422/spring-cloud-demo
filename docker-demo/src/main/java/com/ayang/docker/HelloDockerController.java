package com.ayang.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @ClassName HelloDockerController
 * @Author ayang
 * @Date 2020/9/6
 * @Version V1.0
 * @description
 **/
@RestController
public class HelloDockerController {


    private Logger logger = LoggerFactory.getLogger(HelloDockerController.class);

    @RequestMapping("/hello")
    public String hello() {
        logger.info("request.hello--->" + LocalDateTime.now().toString());
        return "hello docker!";
    }
}
