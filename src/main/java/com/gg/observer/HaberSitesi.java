package com.gg.observer;

import java.util.Observable;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 4:56 PM
 */
public class HaberSitesi implements Abone {
    @Override
    public void update(String mesaj) {
        System.out.println("HaberSitesi mesajı aldı : " + mesaj);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("HaberSitesi mesajı aldı : " + o.toString());
    }
}
