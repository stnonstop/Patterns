package com.gg.state;

import java.math.BigDecimal;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 12:27 PM
 */
public abstract class DefaultState implements KahveOtomatiState {

    @Override
    public void paraEkle(BigDecimal miktar) throws IllegalStateException {
        throw new IllegalStateException();
    }

    @Override
    public void siparisVer(KahveTuru kahveTuru) throws IllegalStateException {
        throw new IllegalStateException();
    }

    @Override
    public void kahveHazirla() throws IllegalStateException {
        throw new IllegalStateException();
    }

    @Override
    public Kahve kahveyiAl() throws IllegalStateException {
        throw new IllegalStateException();
    }

    @Override
    public BigDecimal iptalEt() throws IllegalStateException {
        throw new IllegalStateException();
    }
}
