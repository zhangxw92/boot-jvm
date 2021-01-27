package com.athome.kafka;

import javafx.scene.chart.ValueAxis;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 定义消息通道
 */
public interface HelloMessageChannel {

    static final String Hello = "helloWorld";

    @Output(value = Hello)
    MessageChannel outputHellOutput();

    @Input(value = Hello)
    SubscribableChannel inputHello();
}
