package com.gg.builder;

import com.gg.command.ProgramlanaBilirMenu;
import com.gg.command.SiparisKomutu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: adurmaz

 * Date: 4/27/13
 * Time: 11:57 AM
 */
public class ProgramlanaBilirMenuBuilderImpl implements ProgramlanaBilirMenuBuilder {

    private List<SiparisKomutu> komutlar = new ArrayList<SiparisKomutu>();

    @Override
    public ProgramlanaBilirMenuBuilder addKomut(SiparisKomutu komut) {
        komutlar.add(komut);
        return this;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ProgramlanaBilirMenu getProduct() {
        ProgramlanaBilirMenu menu = new ProgramlanaBilirMenu(komutlar.size());
        for(SiparisKomutu komut : komutlar){
            menu.addSiparisKomutu(komut);
        }
        return menu;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Collection<SiparisKomutu> getKomutlar() {
        return komutlar;
    }
}
