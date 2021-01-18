package com.hy.eurekahystrixclient.controller;

import com.hy.eurekahystrixclient.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HystrixController {
    @Autowired
    HystrixService hystrixService;

    @RequestMapping("hi")
    public String hi(@RequestParam("name") String name){
       return hystrixService.hello(name);
    }
}
