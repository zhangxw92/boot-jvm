package com.athome;

import com.athome.kafka.HelloMessageChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(value = {HelloMessageChannel.class})//绑定消息通道
@SpringBootApplication
public class JvmApplication {

    public static void main(String[] args) {
        SpringApplication.run(JvmApplication.class, args);
    }

}
