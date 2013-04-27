package com.gg.composite;

import com.gg.visitor.UrunVisitor;
import com.gg.visitor.Visitor;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 1:52 PM
 */
public class KolaBardakBirarada extends FirsatUrunu{

    public KolaBardakBirarada() {
        addUrun(new Bardak(1,1));
        addUrun(new Kola(2,5));
    }

    @Override
    public void accept(UrunVisitor urunVisitor) {
        urunVisitor.visit(this);
    }

    public int getIndirimliFiyat(){
        return 2;
    }
}
