package com.gg.visitor;

import com.gg.composite.FirsatUrunu;
import com.gg.composite.Kola;
import com.gg.composite.Urun;

import java.util.HashSet;
import java.util.Set;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 2:27 PM
 */
public class UrunVisitor extends Visitor {
    private int toplamFiyat = 0;
    private Set<Class> firsatUrunTipiSet = new HashSet<Class>();

    public int getToplamFiyat() {
        return toplamFiyat;
    }

    @Override
    public void visit(Urun urun) {
        toplamFiyat += urun.getFiyat();
    }

    public void visit(Kola kola) {
        toplamFiyat += kola.getFiyat();
    }

    @Override
    public void visit(FirsatUrunu firsatUrunu) {

        if(firsatUrunTipiSet.contains(firsatUrunu)) {
            for(Urun urun : firsatUrunu.getUrunSet()){
                toplamFiyat += urun.getFiyat();
            }
        } else {
            firsatUrunTipiSet.add(firsatUrunu.getClass());
            toplamFiyat += firsatUrunu.getIndirimliFiyat();

        }

    }
}
