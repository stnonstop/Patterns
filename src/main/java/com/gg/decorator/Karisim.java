package com.gg.decorator;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 2:27 PM
 */
public abstract class Karisim implements Icecek {
    protected Icecek icecek;

    public Karisim(Icecek icecek) {
        this.icecek = icecek;
    }

}
