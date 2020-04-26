package com.bw.service;

import com.bw.pojo.Gou;
import com.bw.pojo.Jing;
import com.bw.pojo.Yin;

import java.util.List;

public interface JingService {
    List getList();

    Jing calist(int jid);

    List cha();

    void tian(Gou gou);

    List list2(String mohu);

    void tui(int yid);

    Yin chaqian(int id);


    void xiu(double v, int id);

    void xiu2(Integer yage, Integer jid);


    Gou chag(int yid);

    void xiu3(Integer yage, Integer jid);

    void xiu4(Double zong, int id);
}
