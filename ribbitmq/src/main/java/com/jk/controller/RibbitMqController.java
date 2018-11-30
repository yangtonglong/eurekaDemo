package com.jk.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;
@Configuration   //声明队列
public class RibbitMqController {

    @Bean
    public Queue Queue1(){

        Queue lyhTest1 = new Queue("lyhTest1");
        return lyhTest1;
    }


}
