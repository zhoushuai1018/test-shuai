package com.bw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bw.pojo.Gou;
import com.bw.pojo.Jing;
import com.bw.pojo.Yin;
import com.bw.service.JingService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class JingController {
    @Reference
    private JingService ss;

    @RequestMapping("list")
    public List list(){
        List list=ss.getList();

        return list;
    }

    @RequestMapping("calist")
    public Jing calist(int jid){

        Jing jing=ss.calist(jid);
        return jing;
    }

    @RequestMapping("yin")
    public List cha(){
        List list=ss.cha();
        return list;
    }

    @RequestMapping("tian")
    public String tian(@RequestBody Gou gou){
        gou.setZdate(new Date());

        Yin chaqian = this.chaqian(gou.getId());
        double v = chaqian.getQian() - gou.getZong();
        ss.xiu(v,gou.getId());
        ss.xiu2(gou.getYage(),gou.getJid());

        ss.tian(gou);


        return "1";
    }

    @RequestMapping("list2")
    public List list2(@RequestParam(defaultValue = "")String mohu){
        List list=ss.list2(mohu);

        return list;
    }

    @RequestMapping("tui")
    public String tui(int yid){
       Gou gou= ss.chag(yid);
       ss.xiu3(gou.getYage(),gou.getJid());
       ss.xiu4(gou.getZong(),gou.getId());
       ss.tui(yid);
        return "1";
    }

    @RequestMapping("chaqian")
    public Yin chaqian(int id){

       Yin yin= ss.chaqian(id);
       return yin;
    }


    @RequestMapping("ww")
    public String ww(int id){

        Yin yin= ss.chaqian(id);
        return "111";
    }


    @RequestMapping("qqw")
    public String qq(int id){

        Yin yin= ss.chaqian(id);
        return "111";
    }









}
