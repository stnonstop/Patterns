package com.gg.visitor;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 2:01 PM
 */
public class B extends A {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
