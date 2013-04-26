package com.gg.proxy;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 2:52 PM
 */
public class PersonelServisiSecurityProxy implements PersonelServisi {

    private PersonelServisi target;

    public PersonelServisiSecurityProxy(PersonelServisi target) {
        super();
        this.target = target;
    }

    @Override
    public void guncelle(Personel p) {
        System.out.println("Personel sadece kendisi tarafından güncellenebilir");
        target.guncelle(p);
    }
}
