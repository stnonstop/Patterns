package com.gg.state;

import java.math.BigDecimal;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 12:24 PM
 */
public class BakiyeYeterli extends DefaultState {

    private KahveOtomatiStateImpl kahveOtomatiState;

    public BakiyeYeterli(KahveOtomatiStateImpl kahveOtomatiState){
        this.kahveOtomatiState = kahveOtomatiState;
    }

    @Override
    public void paraEkle(BigDecimal miktar) throws IllegalStateException {
        kahveOtomatiState.bakiye.add(miktar);
    }

    @Override
    public void siparisVer(KahveTuru kahveTuru) throws IllegalStateException{
        kahveOtomatiState.kahveTuru = kahveTuru;
        kahveOtomatiState.currentState = new SiparisVerildi(kahveOtomatiState);
    }

    @Override
    public BigDecimal iptalEt() throws IllegalStateException {
        BigDecimal b = kahveOtomatiState.bakiye;
        kahveOtomatiState.bakiye = new BigDecimal("0");
        kahveOtomatiState.currentState = new BakiyeYetersiz(kahveOtomatiState);
        return b;
    }

}
