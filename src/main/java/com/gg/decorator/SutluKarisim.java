package com.gg.decorator;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 2:31 PM
 */
public class SutluKarisim extends Karisim {
    public SutluKarisim(Icecek icecek) {
        super(icecek);
    }

    @Override
    public String toString() {
        return "Sütlü " + this.icecek.toString();
    }
}
