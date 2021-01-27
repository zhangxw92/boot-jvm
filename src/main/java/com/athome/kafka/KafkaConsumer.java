package com.athome.kafka;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    /**
     * 消息监听
     */
    @StreamListener(value = HelloMessageChannel.Hello)
    public void receive(Message<String> message) {

        System.out.println("------------------" + message.toString());

        Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
        if (acknowledgment != null) {
            acknowledgment.acknowledge();
        }
    }
}
