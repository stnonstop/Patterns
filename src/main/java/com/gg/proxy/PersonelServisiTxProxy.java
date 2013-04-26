package com.gg.proxy;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 3:01 PM
 */
public class PersonelServisiTxProxy implements PersonelServisi {

    private PersonelServisi target;

    public PersonelServisiTxProxy(PersonelServisi target){
        super();
        this.target = target;
    }

    @Override
    public void guncelle(Personel p) {
        try{
            System.out.println("tx begin");
            target.guncelle(p);
            System.out.println("tx commit");
        } catch (Exception e) {
            System.out.println("tx rollback");
            throw new RuntimeException(e);
        }
    }
}
