package com.ayang.cconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName TestConsulController
 * @Author ayang
 * @Date 2020/8/26
 * @Version V1.0
 * @description
 **/
@RestController
public class TestConsulController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 查询consul-client服务在线个数
     * @return
     */
    @RequestMapping("/testCount")
    public String testCount(){
        int size = discoveryClient.getInstances("consul-client").size();
        return "consul-client-first服务个数为:" + size;
    }


    /**
     * 查询consul-client服务在线个数
     * @return
     */
    @RequestMapping("/testHello")
    public String testHello(){
        ServiceInstance instance = loadBalancerClient.choose("consul-client");
        String helloUrl = instance.getUri().toASCIIString() + "/hello";
        String testResult = new RestTemplate().getForObject(helloUrl, String.class);
        return testResult;
    }






}
