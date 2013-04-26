package com.gg.adapter;

import oodp.philips.Philips;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 4:04 PM
 */
public class PhilipsLambaAdapter implements Lamba {

    private Philips philips = new Philips();

    @Override
    public void on() {
        philips.switchOn();
    }

    @Override
    public void off() {
        philips.switchOff();
    }
}
