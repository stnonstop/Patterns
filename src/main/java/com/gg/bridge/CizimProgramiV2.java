package com.gg.bridge;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 4:37 PM
 */
public class CizimProgramiV2 implements CizimProgrami {

    private oodp.cizim2.CizimProgramiV2 cizimAPI = new oodp.cizim2.CizimProgramiV2();

    @Override
    public void cizgiCiz() {
        cizimAPI.ciz_cizgi();
    }

    @Override
    public void cemberCiz() {
        cizimAPI.ciz_cember();
    }
}
