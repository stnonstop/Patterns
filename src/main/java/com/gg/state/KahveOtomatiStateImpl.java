package com.gg.state;

import java.math.BigDecimal;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 12:16 PM
 */
public class KahveOtomatiStateImpl implements KahveOtomatiState {

    KahveOtomatiState currentState = new BakiyeYetersiz(this);

    BigDecimal bakiye = new BigDecimal("0");
    final BigDecimal ucret = new BigDecimal("1.00");
    KahveTuru kahveTuru;

    @Override
    public void paraEkle(BigDecimal miktar) throws IllegalStateException {
        currentState.paraEkle(miktar);
    }

    @Override
    public void siparisVer(KahveTuru kahveTuru) throws IllegalStateException {
        currentState.siparisVer(kahveTuru);
    }

    @Override
    public void kahveHazirla() throws IllegalStateException {
        currentState.kahveHazirla();
    }

    @Override
    public Kahve kahveyiAl() throws IllegalStateException {
        return currentState.kahveyiAl();
    }

    @Override
    public BigDecimal iptalEt() throws IllegalStateException {
        return currentState.iptalEt();
    }
}
