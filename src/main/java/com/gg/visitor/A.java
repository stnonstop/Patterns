package com.gg.visitor;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 2:00 PM
 */
public class A {

    public void accept(Visitor v) {
        v.visit(this);
    }
}
