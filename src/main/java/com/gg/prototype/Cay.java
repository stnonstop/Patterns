package com.gg.prototype;

import com.gg.decorator.Icecek;

import java.util.ArrayList;
import java.util.List;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 2:26 PM
 */
public class Cay implements Icecek,Cloneable {

    private int sekerSayisi;

    private List<Cay> cayList = new ArrayList<Cay>();

    public Cay(){

    }

    public Cay(Cay cay){
        this.sekerSayisi = cay.sekerSayisi;
        this.cayList = cay.cayList;
    }

    public int getSekerSayisi() {
        return sekerSayisi;
    }

    public void setSekerSayisi(int sekerSayisi) {
        this.sekerSayisi = sekerSayisi;
    }

    public List<Cay> getCayList() {
        return cayList;
    }

    @Override
    public String toString(){
        return "Çay";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
