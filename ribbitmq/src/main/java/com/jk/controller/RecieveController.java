package com.jk.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "lyhTest1")
public class RecieveController {

    @RabbitHandler
    public void receiver(String msg){
        System.out.println("Test1 receiver1:"+msg);
    }
}
