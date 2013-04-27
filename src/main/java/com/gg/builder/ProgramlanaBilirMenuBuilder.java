package com.gg.builder;

import com.gg.command.ProgramlanaBilirMenu;
import com.gg.command.SiparisKomutu;

import java.util.Collection;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 11:55 AM
 */
public interface ProgramlanaBilirMenuBuilder {
    public ProgramlanaBilirMenuBuilder addKomut(SiparisKomutu komut);
    public ProgramlanaBilirMenu getProduct();
    public Collection<SiparisKomutu> getKomutlar();
}
