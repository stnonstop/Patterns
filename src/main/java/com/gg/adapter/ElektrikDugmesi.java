package com.gg.adapter;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 3:59 PM
 */
public class ElektrikDugmesi {

    private Lamba lamba;

    public void setLamba(Lamba lamba) {
        this.lamba = lamba;
    }

    public void ac(){
        lamba.on();
    }

    public void kapat(){
        lamba.off();
    }
}
