package com.gg.strategy;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 10:37 AM
 */
public enum Ortam {
    KARA(new Yurumek()), HAVA(new Ucmak()), DENIZ(new Yuzmek());

    private HareketSekli hareketSekli;

    private Ortam(HareketSekli hareketSekli){
        this.hareketSekli = hareketSekli;
    }

    public HareketSekli getHareketSekli() {
        return hareketSekli;
    }
}
