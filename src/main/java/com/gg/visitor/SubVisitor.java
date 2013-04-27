package com.gg.visitor;

import com.gg.composite.Bardak;
import com.gg.composite.Kola;
import com.gg.composite.TemelUrun;
import com.gg.composite.Urun;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 2:04 PM
 */
public class SubVisitor extends Visitor {
    @Override
    public void visit(A a) {
        System.out.println("Sub visit A");
    }

    @Override
    public void visit(B b) {
        System.out.println("Sub visit B");
    }

    public void visit(Urun urun) {

    }

    public void visit(TemelUrun temelUrun) {

    }

    public void visit(Bardak bardak) {

    }

    public void visit(Kola kola) {

    }
}
