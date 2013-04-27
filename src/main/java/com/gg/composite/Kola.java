package com.gg.composite;

import com.gg.visitor.UrunVisitor;
import com.gg.visitor.Visitor;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 1:50 PM
 */
public class Kola extends TemelUrun {
    public Kola(int fiyat, int agirlik) {
        super(fiyat, agirlik);
    }

    @Override
    public void accept(UrunVisitor urunVisitor) {
        urunVisitor.visit(this);
    }
}
