package com.gg.composite;

import com.gg.visitor.UrunVisitor;
import com.gg.visitor.Visitor;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 1:47 PM
 */
public abstract class TemelUrun implements Urun {

    private int fiyat;
    private int agirlik;

    public TemelUrun(int fiyat, int agirlik){
        super();
        this.agirlik = agirlik;
        this.fiyat = fiyat;
    }

    @Override
    public int getAgirlik() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getFiyat() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addUrun(Urun urun) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeUrun(Urun urun) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accept(UrunVisitor urunVisitor) {
        urunVisitor.visit(this);
    }
}
