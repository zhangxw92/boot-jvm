package com.athome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JvmController {

    @GetMapping(value = "/get")
    public String get() {
        return "JVM调优测试";
    }
}
