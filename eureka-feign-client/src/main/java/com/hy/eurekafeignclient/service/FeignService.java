package com.hy.eurekafeignclient.service;

import com.hy.cloudapi.service.EmpService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient("eureka-provider")
public interface FeignService extends EmpService {

}
