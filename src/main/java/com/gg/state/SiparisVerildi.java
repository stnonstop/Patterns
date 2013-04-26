package com.gg.state;

import java.math.BigDecimal;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 1:53 PM
 */
public class SiparisVerildi extends DefaultState {
    private KahveOtomatiStateImpl kahveOtomatiState;

    public SiparisVerildi(KahveOtomatiStateImpl kahveOtomatiState){
        this.kahveOtomatiState = kahveOtomatiState;
    }

    @Override
    public void kahveHazirla() throws IllegalStateException{
        kahveOtomatiState.currentState = new KahveHazir(kahveOtomatiState);
    }

    @Override
    public BigDecimal iptalEt() throws IllegalStateException {
        BigDecimal b = kahveOtomatiState.bakiye;
        kahveOtomatiState.bakiye = new BigDecimal("0");
        kahveOtomatiState.currentState = new BakiyeYetersiz(kahveOtomatiState);
        return b;
    }
}
