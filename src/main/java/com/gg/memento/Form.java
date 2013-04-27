package com.gg.memento;

import java.io.Serializable;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 3:30 PM
 */
public class Form{
    private String ad;
    private String soyad;

    public Form(String ad, String soyad){
        this.ad= ad;
        this.soyad = soyad;
    }

    public Form(FormMemento formMemento){
       restore(formMemento);
    }

    @Override
    public String toString() {
        return ad + " " + soyad;
    }

    public FormMemento createMemento() {
        return new FormMemento(ad,soyad);
    }

    public void restore(FormMemento memento){
        this.ad = memento.ad;
        this.soyad = memento.soyad;
    }

    public static class FormMemento implements Serializable{
        private String ad;
        private String soyad;

        private FormMemento(String ad, String soyad) {
            this.ad = ad;
            this.soyad = soyad;
        }
    }
}
