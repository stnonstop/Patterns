package com.gg.state;

import java.math.BigDecimal;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 11:53 AM
 */
public class KahveOtomatiOrg implements KahveOtomati {

    private OtomatState state = OtomatState.BAKIYE_YETERSIZ;

    private BigDecimal bakiye = new BigDecimal("0");

    private final BigDecimal ucret = new BigDecimal("1.00");

    private KahveTuru kahveTuru;

    @Override
    public void paraEkle(BigDecimal miktar) throws IllegalStateException {
        switch (state) {
            case BAKIYE_YETERSIZ:
            case BAKIYE_YETERLI:
                bakiye = bakiye.add(miktar);
                if(bakiye.compareTo(ucret) >= 0) {
                    state = OtomatState.BAKIYE_YETERLI;
                }
                break;
            case SIPARIS_VERILDI:
            case KAHVE_HAZIR:
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public void siparisVer(KahveTuru kahveTuru) throws IllegalStateException{
        switch (state) {
            case BAKIYE_YETERLI:
                this.kahveTuru = kahveTuru;
                state = OtomatState.SIPARIS_VERILDI;
                break;
            case BAKIYE_YETERSIZ:
            case SIPARIS_VERILDI:
            case KAHVE_HAZIR:
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public void kahveHazirla() throws IllegalStateException{
        switch (state) {
            case SIPARIS_VERILDI:
                state = OtomatState.KAHVE_HAZIR;
                break;
            case BAKIYE_YETERSIZ:
            case BAKIYE_YETERLI:
            case KAHVE_HAZIR:
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public Kahve kahveyiAl() throws IllegalStateException{
        switch (state) {
            case KAHVE_HAZIR:
                bakiye = bakiye.subtract(ucret);
                if(bakiye.compareTo(ucret) >= 0) {
                    state = OtomatState.BAKIYE_YETERLI;
                }  else {
                    state = OtomatState.BAKIYE_YETERSIZ;
                }
                return new Kahve();
            case BAKIYE_YETERSIZ:
            case BAKIYE_YETERLI:
            case SIPARIS_VERILDI:
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public BigDecimal iptalEt() throws IllegalStateException {
        switch (state) {
            case BAKIYE_YETERSIZ:
            case BAKIYE_YETERLI:
            case SIPARIS_VERILDI:
                BigDecimal b = bakiye;
                state = OtomatState.BAKIYE_YETERSIZ;
                bakiye = new BigDecimal("0");
                return b;
            case KAHVE_HAZIR:
            default:
                throw new IllegalStateException();
        }
    }
}
