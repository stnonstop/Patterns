package com.gg.mediator;

import com.gg.observer.Abone;
import com.gg.observer.Ajans;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 5:09 PM
 */
public abstract class HaberKaynagi implements Abone {

    private Ajans mediator;

    public HaberKaynagi(Ajans mediator) {
        this.mediator = mediator;
    }

    public void haberVer(String mesaj) {
        mediator.haberVer(mesaj);
    }


}
