package com.hy.eurekaprovideranother.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/port")
    public String getPort(){
        return "eureka-provider-another我的端口号是: "+port;
    }

    @RequestMapping("/add")
    public String add(String empno,String ename){
        return empno+""+ename+""+port;
    }

    @RequestMapping("/get")
    public String get(String empno){
        return empno+""+port;
    }

    @RequestMapping("hello")
    public String hello(String name){
        int i = 1/0;
        return name+"---"+port;
    }

}
