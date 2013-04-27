package com.gg.facade;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 4:26 PM
 */
public class MorgageServisi {
    private KrediKartlariSistemi krediKartlariSistemi = new KrediKartlariSistemi();
    private HesapSistemi hesapSistemi = new HesapSistemi();
    private BorcSistemi borcSistemi = new BorcSistemi();

    public boolean basvur(String tcNo){
        return krediKartlariSistemi.check(tcNo) && hesapSistemi.check(tcNo) && borcSistemi.check(tcNo);
    }
}
