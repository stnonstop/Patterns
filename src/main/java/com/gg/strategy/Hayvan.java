package com.gg.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 10:35 AM
 */
public abstract class Hayvan {

    private int bacakSayisi;

    private HareketSekli hareketSekli;

    protected List<Ortam> hareketEdebilirOrtamListesi = new ArrayList<Ortam>();

    public int getBacakSayisi() {
        return bacakSayisi;
    }

    public Hayvan(int bacakSayisi){
        this.bacakSayisi = bacakSayisi;
    }

    public void hareketEt(Ortam ortam){
        if(hareketEdebilirOrtamListesi.contains(ortam)) {
            System.out.print(this.getClass().getSimpleName() + " ");
            ortam.getHareketSekli().hareketEt();
        } else {
            throw new IllegalStateException();
        }

    }
}
