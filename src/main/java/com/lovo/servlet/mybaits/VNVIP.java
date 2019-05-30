package com.lovo.servlet.mybaits;

public class VNVIP implements HeroBuilder {
    Hero h=new Hero();
    @Override
    public void buildPymbol() {
        h.setPymbol("全物理攻击符文");
    }

    @Override
    public void buildKill() {

        h.setKill("终极时刻");
    }

    @Override
    public void buildKien() {

        h.setKien("烈焰美人");
    }

    @Override
    public Hero creatHero() {

        return h;
    }
}
