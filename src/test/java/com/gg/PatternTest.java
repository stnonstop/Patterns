package com.gg;

import com.gg.decorator.*;
import com.gg.state.*;
import com.gg.state.Kahve;
import com.gg.strategy.*;

import junit.framework.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 10:40 AM
 */
public class PatternTest {

    @Test
    public void StrategyPatternTest(){
        List<Hayvan> list = Arrays.asList(new Kedi(), new Balik(), new UcanBalik());
        for(Hayvan hayvan : list) {

            try{
                hayvan.hareketEt(Ortam.DENIZ);
            } catch (IllegalStateException e){
                System.out.println(e.toString() + " for : " + hayvan.getClass().getSimpleName());
            }

            try {
                hayvan.hareketEt(Ortam.KARA);
            } catch (IllegalStateException e){
                System.out.println(e.toString() + " for : " + hayvan.getClass().getSimpleName());
            }

        }
    }

    @Test
    public void StatePatternTest() {
        KahveOtomati otomat = new KahveOtomatiOrg();
        otomat.paraEkle(new BigDecimal("1.0"));
        otomat.siparisVer(KahveTuru.SADE);
        otomat.kahveHazirla();
        Kahve kahve = otomat.kahveyiAl();
        System.out.println(kahve.getClass().getSimpleName());

        KahveOtomatiStateImpl otomatiState = new KahveOtomatiStateImpl();
        otomatiState.paraEkle(new BigDecimal("1.0"));
        otomatiState.siparisVer(KahveTuru.SEKERLI);
        otomatiState.kahveHazirla();
        Kahve kahve2 = otomatiState.kahveyiAl();
        System.out.println(kahve2.getClass().getSimpleName());
    }

    @Test
    public void decoratorPatternTest(){
        Icecek icecek = new BuzluKarisim(new SutluKarisim(new com.gg.decorator.Kahve()));
        System.out.println(icecek);
        Icecek icecek1 = new SutluKarisim(new Cay());
        System.out.println(icecek1);
    }
}
