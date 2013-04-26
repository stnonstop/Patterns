package com.gg.proxy;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 2:54 PM
 */
public class Client {
    private PersonelServisi personelServisi;

    public void guncelle(Personel personel) {
        personelServisi.guncelle(personel);
    }

    public void setPersonelServisi(PersonelServisi personelServisi){
        this.personelServisi = personelServisi;
    }
}
