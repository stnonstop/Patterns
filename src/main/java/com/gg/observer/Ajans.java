package com.gg.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 4:53 PM
 */
public class Ajans extends Observable {
    /*private List<Abone> abones = new ArrayList<Abone>();

    public void register(Abone abone) {
        abones.add(abone);
    }

    public void deregister(Abone abone) {
        abones.remove(abone);
    } */

    public void register(Abone abone){
        addObserver(abone);
    }

    public void deregister(Abone abone){
        deleteObserver(abone);
    }

    public void haberVer(String mesaj) {
        /*for(Abone abone : abones){
            abone.update(mesaj);
        } */
        setChanged();
        notifyObservers(mesaj);
    }
}
