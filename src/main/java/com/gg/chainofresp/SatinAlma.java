package com.gg.chainofresp;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 3:17 PM
 */
public class SatinAlma {
    private Management m = new ProjeYoneticisi(new BaskanYardimcisi(new Baskan()));

    public boolean onayla(Request request){
        return  m.onayla(request);
    }
}
