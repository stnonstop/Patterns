package com.gg.observer;

import com.gg.mediator.HaberKaynagi;

import java.util.Observable;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 4:56 PM
 */
public class Gazete extends HaberKaynagi implements Abone {

    public Gazete(Ajans mediator) {
        super(mediator);
    }

    @Override
    public void update(String mesaj) {
        System.out.println("Gazete mesajı aldı : " + mesaj);
    }


    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Gazete mesajı aldı : " + o.toString());
    }
}
