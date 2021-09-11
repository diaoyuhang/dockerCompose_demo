package com.example.dockercompose_demo.controller;

import com.example.dockercompose_demo.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RestController
public class Main {
    @Resource
    private MainService mainService;

    @GetMapping("/test")
    public String test() {
        mainService.test();
        return LocalDateTime.now().toString();
    }
}
