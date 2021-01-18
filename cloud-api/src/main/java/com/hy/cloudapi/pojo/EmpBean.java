package com.hy.cloudapi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmpBean {
    private String empno;
    private String ename;
    private String job;
    private String mgr;
    private Date hiredate;
    private String sal;
    private String comm;
    private String img;
    private Integer deptno;//所在部门id

}
