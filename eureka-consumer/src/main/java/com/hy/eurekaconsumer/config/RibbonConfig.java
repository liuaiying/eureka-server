package com.hy.eurekaconsumer.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced//使RestTemplate具备了负载均衡的能力
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
