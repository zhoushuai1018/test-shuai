package com.bw.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Jing implements Serializable {
    private Integer jid;
    private String jname;
    private String jie;
    private Date sdate;
    private Double price;
    private Integer age;
}
