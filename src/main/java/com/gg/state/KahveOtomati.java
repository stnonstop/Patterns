package com.gg.state;

import java.math.BigDecimal;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 11:49 AM
 */
public interface KahveOtomati {
    public void paraEkle(BigDecimal miktar) throws IllegalStateException;
    public void siparisVer(KahveTuru kahveTuru) throws IllegalStateException;
    public void kahveHazirla() throws IllegalStateException;
    public Kahve kahveyiAl() throws IllegalStateException;
    public BigDecimal iptalEt() throws IllegalStateException;
}
