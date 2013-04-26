package com.gg.decorator;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 2:28 PM
 */
public class BuzluKarisim extends Karisim {

    public BuzluKarisim(Icecek icecek) {
        super(icecek);
    }

    @Override
    public String toString() {
        return "Buzlu " + this.icecek.toString();
    }
}
