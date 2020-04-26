package com.bw.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GouVo implements Serializable {
    private Integer yid;
    private Integer yage;
    private Double zong;
    private int id;
    private Date zdate;
    private Integer jid;
    private String jname;
    private String hao;
    private Date sdate;
    private Double price;


}
