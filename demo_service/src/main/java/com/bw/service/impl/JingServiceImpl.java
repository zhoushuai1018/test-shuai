package com.bw.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bw.mapper.JingMapper;
import com.bw.pojo.Gou;
import com.bw.pojo.Jing;
import com.bw.pojo.Yin;
import com.bw.service.JingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JingServiceImpl implements JingService {
    @Autowired
    private JingMapper mapper;

    @Override
    public List getList() {
        return mapper.getList();
    }

    @Override
    public Jing calist(int jid) {
        return mapper.calist(jid);
    }

    @Override
    public List cha() {
        return mapper.cha();
    }

    @Override
    public void tian(Gou gou) {
        mapper.tian(gou);
    }

    @Override
    public List list2(String mohu) {
        return mapper.list2(mohu);


    }

    @Override
    public void tui(int yid) {
        mapper.tui(yid);
    }

    @Override
    public Yin chaqian(int id) {
        return mapper.chaqian(id);
    }

    @Override
    public void xiu(double v, int id) {
        mapper.xiu(v,id);
    }

    @Override
    public void xiu2(Integer yage, Integer jid) {
        mapper.xiu2(yage,jid);
    }

    @Override
    public Gou chag(int yid) {
        return mapper.chag(yid);
    }

    @Override
    public void xiu3(Integer yage, Integer jid) {
        mapper.xiu3(yage,jid);
    }

    @Override
    public void xiu4(Double zong, int id) {
        mapper.xiu4(zong,id);
    }
}
