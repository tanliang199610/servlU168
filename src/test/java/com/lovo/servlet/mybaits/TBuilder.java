package com.lovo.servlet.mybaits;

import org.junit.Test;

public class TBuilder {
    @Test
    public void testBuilder(){
     HeroBuilder he=new VNBasic();
     //生产者
        MakeHero mak=new MakeHero(he);
        mak.build();//开始创建

        Hero h=mak.getHero();//获得英雄
        System.out.printf(h.getKill()+"  "+h.getKien());
    }
}