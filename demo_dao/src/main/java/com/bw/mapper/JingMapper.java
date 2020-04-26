package com.bw.mapper;

import com.bw.pojo.Gou;
import com.bw.pojo.Jing;
import com.bw.pojo.Yin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JingMapper {
    List getList();

    Jing calist(int jid);

    List cha();

    void tian(Gou gou);

    List list2(@Param("mohu") String mohu);

    void tui(int yid);

    Yin chaqian(int id);


    void xiu(@Param("v")double v,@Param("id") int id);

    void xiu2(@Param("yage")Integer yage, @Param("jid")Integer jid);

    Gou chag(int yid);

    void xiu3(@Param("yage")Integer yage,@Param("jid") Integer jid);

    void xiu4(@Param("zong")Double zong,@Param("id") int id);
}
