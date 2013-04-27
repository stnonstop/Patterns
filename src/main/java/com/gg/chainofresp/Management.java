package com.gg.chainofresp;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 3:07 PM
 */
public abstract class Management {

    protected Management successor;

    public Management(Management successor) {
        super();
        this.successor = successor;
    }

    public abstract boolean onayla(Request request);
}
