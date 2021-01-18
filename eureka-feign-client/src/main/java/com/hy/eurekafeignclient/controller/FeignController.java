package com.hy.eurekafeignclient.controller;

import com.hy.cloudapi.pojo.EmpBean;
import com.hy.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService feignService;

    @RequestMapping("hello")
    public String hello(@RequestParam("empno") String empno, @RequestParam("ename") String ename){
        String empBean = feignService.get(empno);

        String add = feignService.add(empno, ename);
        return empBean.toString()+"----------"+add;
    }
}
