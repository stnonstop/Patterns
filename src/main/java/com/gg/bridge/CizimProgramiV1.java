package com.gg.bridge;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 4:37 PM
 */
public class CizimProgramiV1 implements CizimProgrami {

    private oodp.cizim1.CizimProgramiV1 cizimAPI = new oodp.cizim1.CizimProgramiV1();

    @Override
    public void cizgiCiz() {
        cizimAPI.cizgiCiz();
    }

    @Override
    public void cemberCiz() {
        cizimAPI.cemberCiz();
    }
}
