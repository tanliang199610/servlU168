package com.lovo.servlet.mybaits;

public interface HeroBuilder {
    /**
     * 符文
     * @return
     */
    public void buildPymbol();

    /**
     * 技能
     * @return
     */
    public void buildKill();

    /**
     * 皮肤
     * @return
     */
    public void buildKien();

    /**
     * 英雄
     */
    public Hero creatHero();
}
