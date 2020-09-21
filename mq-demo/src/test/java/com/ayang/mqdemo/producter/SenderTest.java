package com.ayang.mqdemo.producter;

import com.ayang.mqdemo.MqDemoApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;


class SenderTest extends MqDemoApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        for (int i = 0; i < 10; i++) {
            String messge = UUID.randomUUID().toString();
            sender.send(messge);
        }
    }

}