package com.gg.bridge;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 4:42 PM
 */
public abstract class Sekil {
    public abstract void ciz();

    protected CizimProgrami cizimProgrami;

    public void setCizimProgrami(CizimProgrami cizimProgrami) {
        this.cizimProgrami = cizimProgrami;
    }
}
