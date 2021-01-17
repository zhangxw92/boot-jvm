package com.athome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class JvmController {

    private static AtomicInteger atomicInteger = new AtomicInteger();

    @GetMapping(value = "/get")
    public String get() {
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                atomicInteger.getAndAdd(1);
            }).start();
        }

        return "JVM调优测试";
    }

    @GetMapping("/test")
    public void test() {
        System.out.println("测试死循环");
        while (true) {
            byte[] b = new byte[1 * 1024 * 1024];
        }
    }
}
