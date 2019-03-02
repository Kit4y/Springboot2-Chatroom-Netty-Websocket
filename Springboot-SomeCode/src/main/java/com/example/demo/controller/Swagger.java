package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Swagger {
    @GetMapping("/swaggertest")
    @ApiOperation(value = "测试Swagger") //添加这个 在swagger上展示
    public String hello(){
        return "hello SpringBoot-swagger";
    }
}
