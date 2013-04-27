package com.gg.visitor;

import com.gg.composite.*;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 2:01 PM
 */
public class Visitor {
    public void visit(A a){
        System.out.println("Visit A");
    }
    public void visit(B b) {
        System.out.println("Visit B");
    }

    public void visit(Urun urun) {

    }

    public void visit(FirsatUrunu firsatUrunu) {

    }


}
