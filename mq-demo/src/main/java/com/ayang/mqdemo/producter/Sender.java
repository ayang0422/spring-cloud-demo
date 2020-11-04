package com.ayang.mqdemo.producter;

import com.ayang.mqdemo.config.RabbitConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Sender
 * @Author ayang
 * @Date 2020/9/13
 * @Version V1.0
 * @description
 **/
@RestController
@Slf4j
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    RabbitmqPublish rabbitmqPublish;

    public void send(String message) {
        System.out.println("Sender : " + message);
        this.rabbitTemplate.convertAndSend("hello", message);
    }


    @RequestMapping("/send")
    public String send() {
        
        //发送多个延时消息
        rabbitmqPublish.sendTimeoutMsg("hello1", "routingKey1", 40);
        rabbitmqPublish.sendTimeoutMsg("hello2", "routingKey2", 20);
        rabbitmqPublish.sendTimeoutMsg("hello3", "routingKey1", 60);

        //发送普通消息
        rabbitmqPublish.sendMsg(RabbitConfig.Order_Pay_Queue_Name, "weixin");
        rabbitmqPublish.sendMsg(RabbitConfig.Order_Pay_Queue_Name, "alipay");

        return "success";
    }
}
