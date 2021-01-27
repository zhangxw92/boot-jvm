package com.athome.controller;

import com.athome.kafka.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {


    @Autowired
    private KafkaSender kafkaSender;

    @GetMapping("/hello")
    public String hello() {

        kafkaSender.send("helloword");

        return "消息发送成功";
    }
}
