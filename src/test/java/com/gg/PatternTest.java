package com.gg;

import com.gg.adapter.ElektrikDugmesi;
import com.gg.adapter.GELambaAdapter;
import com.gg.adapter.PhilipsLambaAdapter;
import com.gg.bridge.*;
import com.gg.decorator.*;
import com.gg.proxy.*;
import com.gg.state.*;
import com.gg.state.Kahve;
import com.gg.strategy.*;

import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;
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

    @Test
    public void proxyPatternTest(){
        Client c = new Client();
        c.setPersonelServisi(new PersonelServisiSecurityProxy(new PersonelServisiTxProxy(new PersonelServisiImpl())));
        c.guncelle(new Personel());
        System.out.println("------------------------------");
        PersonelServisi target = new PersonelServisiImpl();
        TxProxyCommand txCommand = new TxProxyCommand(target);
        ClassLoader classLoader = PersonelServisi.class.getClassLoader();
        Class[] interfaces = new Class[]{PersonelServisi.class};
        PersonelServisi personelServisi = (PersonelServisi)Proxy.newProxyInstance(classLoader, interfaces, txCommand);
        personelServisi = (PersonelServisi)Proxy.newProxyInstance(classLoader, interfaces, new SecurityProxyCommand(personelServisi));
        Client c2 = new Client();
        c.setPersonelServisi(personelServisi);
        c.guncelle(new Personel());
    }

    @Test
    public void adapterPatternTest(){
        ElektrikDugmesi dugme = new ElektrikDugmesi();
        dugme.setLamba(new GELambaAdapter());
        dugme.ac();
        dugme.kapat();

    }

    @Test
    public void bridgePatternTest() {
        Sekil k = new Kare();
        k.setCizimProgrami(new CizimProgramiV1());
        k.ciz();

        Sekil u = new Ucgen();
        u.setCizimProgrami(new CizimProgramiV2());

        u.ciz();
    }
}
