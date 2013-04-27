package com.gg.factory;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 9:38 AM
 */
public class Menu {

    private Asci asci = AsciFactory.createEgeliAsci();

    public Tarhana createTarhana(){
        return asci.createTarhana();
    }

    public void setAsci(Asci asci) {
        this.asci = asci;
    }
}
