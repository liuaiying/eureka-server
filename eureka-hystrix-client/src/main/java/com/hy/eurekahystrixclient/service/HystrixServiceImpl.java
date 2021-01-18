package com.hy.eurekahystrixclient.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixServiceImpl implements HystrixService{

    @Override
    public String hello(String name) {
        return "系统出小差了";
    }
}
