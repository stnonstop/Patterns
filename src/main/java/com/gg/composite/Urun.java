package com.gg.composite;

import com.gg.visitor.UrunVisitor;
import com.gg.visitor.Visitor;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 1:43 PM
 */
public interface Urun {
    public int getAgirlik();
    public int getFiyat();

    public void addUrun(Urun urun);
    public void removeUrun(Urun urun);

    public void accept(UrunVisitor urunVisitor);

}
