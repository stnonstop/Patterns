package com.gg.strategy;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 10:39 AM
 */
public class Kedi extends Hayvan {
    public Kedi() {
        super(4);
        hareketEdebilirOrtamListesi.add(Ortam.DENIZ);
        hareketEdebilirOrtamListesi.add(Ortam.KARA);
    }

   /* @Override
    public void hareketEt(Ortam ortam) {
        if(ortam.equals(Ortam.KARA)){
            System.out.println("Kedi karada yürüyor");
        } else if(ortam.equals(Ortam.DENIZ)) {
            System.out.println("Kedi denizde yüzüyor");
        } else {
            throw new IllegalStateException("Illegal ortam");
        }

    }    */
}
