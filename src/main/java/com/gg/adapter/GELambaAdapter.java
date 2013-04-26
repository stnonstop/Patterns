package com.gg.adapter;

import oodp.ge.GeneralElectric;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 4:08 PM
 */
public class GELambaAdapter implements Lamba {

    private GeneralElectric ge = new GeneralElectric();

    @Override
    public void on() {
        ge.electricityOn();
    }

    @Override
    public void off() {
        ge.electricityOff();
    }
}
