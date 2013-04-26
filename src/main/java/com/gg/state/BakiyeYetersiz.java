package com.gg.state;

import java.math.BigDecimal;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 12:15 PM
 */
public class BakiyeYetersiz extends DefaultState {

    private KahveOtomatiStateImpl kahveOtomatiState;

    public BakiyeYetersiz(KahveOtomatiStateImpl kahveOtomatiState){
        this.kahveOtomatiState = kahveOtomatiState;
    }

    @Override
    public void paraEkle(BigDecimal miktar) throws IllegalStateException {
        kahveOtomatiState.bakiye.add(miktar);
        kahveOtomatiState.currentState = new BakiyeYeterli(kahveOtomatiState);
    }

    @Override
    public BigDecimal iptalEt() throws IllegalStateException {
        BigDecimal b = kahveOtomatiState.bakiye;
        kahveOtomatiState.bakiye = new BigDecimal("0");
        kahveOtomatiState.currentState = new BakiyeYetersiz(kahveOtomatiState);
        return b;
    }
}
