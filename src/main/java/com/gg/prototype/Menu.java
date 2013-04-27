package com.gg.prototype;


/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 9:51 AM
 */
public class Menu {

    public Cay SABLON = new Cay();
    {
        SABLON.setSekerSayisi(1);
    }
    public Cay getTekSekerliCayCek() {
        try {
            return (Cay)SABLON.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }

}

