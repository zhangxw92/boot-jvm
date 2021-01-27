package com.athome.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {

    @Autowired
    private HelloMessageChannel channel;

    /**
     * 消息发送
     */
    public void send(String message) {

        boolean send = channel.outputHellOutput().send(MessageBuilder.withPayload(message).build());
        if (send) {
            System.out.println("消息发送成功");
        } else {
            System.out.println("消息发送失败");
        }
    }
}
