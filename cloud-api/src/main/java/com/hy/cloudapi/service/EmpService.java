package com.hy.cloudapi.service;

import com.hy.cloudapi.pojo.EmpBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.*;

public interface EmpService {
    @RequestMapping("get")
    String get(@RequestParam("empno") String empno);

    @RequestMapping("add")
    String add(@RequestParam("empno") String empno,@RequestParam("ename") String ename);
}
