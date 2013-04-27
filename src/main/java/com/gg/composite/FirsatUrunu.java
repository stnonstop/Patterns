package com.gg.composite;

import com.gg.visitor.UrunVisitor;
import com.gg.visitor.Visitor;

import java.util.HashSet;
import java.util.Set;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 1:45 PM
 */
public abstract class FirsatUrunu implements Urun {

    private Set<Urun> urunSet = new HashSet<Urun>();

    @Override
    public int getAgirlik() {
        int topLamAgirlik = 0;
        for(Urun urun: urunSet) {
            topLamAgirlik += urun.getAgirlik();
        }
        return topLamAgirlik;
    }

    @Override
    public int getFiyat() {
        int topLamFiyat = 0;
        for(Urun urun: urunSet) {
            topLamFiyat += urun.getAgirlik();
        }
        return topLamFiyat;
    }

    @Override
    public void addUrun(Urun urun) {
        urunSet.add(urun);
    }

    @Override
    public void removeUrun(Urun urun) {
        urunSet.remove(urun);
    }

    public Set<Urun> getUrunSet() {
        return urunSet;
    }

    public abstract int getIndirimliFiyat();
}
