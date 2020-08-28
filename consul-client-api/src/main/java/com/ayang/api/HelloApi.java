package com.ayang.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName HelloApi
 * @Author ayang
 * @Date 2020/8/26
 * @Version V1.0
 * @description
 **/
@FeignClient(value = "consul-client")
public interface HelloApi {

    @GetMapping("/hello")
    String testHello();

}
