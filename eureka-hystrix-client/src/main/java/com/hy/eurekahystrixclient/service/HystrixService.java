package com.hy.eurekahystrixclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "eureka-provider",fallback = HystrixServiceImpl.class)
public interface HystrixService {
    @RequestMapping("hello")
    String hello(@RequestParam("name") String name);
}
