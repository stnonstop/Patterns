package com.gg;

import com.gg.adapter.ElektrikDugmesi;
import com.gg.adapter.GELambaAdapter;
import com.gg.adapter.PhilipsLambaAdapter;
import com.gg.bridge.*;
import com.gg.builder.ProgramlanaBilirMenuBuilder;
import com.gg.builder.ProgramlanaBilirMenuBuilderImpl;
import com.gg.chainofresp.*;
import com.gg.command.MantiSiparisi;
import com.gg.command.ProgramlanaBilirMenu;
import com.gg.command.SiparisKomutu;
import com.gg.command.TarhanaSiparis;
import com.gg.composite.Kola;
import com.gg.composite.KolaBardakBirarada;
import com.gg.composite.Urun;
import com.gg.decorator.*;
import com.gg.decorator.Cay;
import com.gg.facade.MorgageServisi;
import com.gg.factory.Asci;
import com.gg.factory.ege.EgeliAsci;
import com.gg.flyweight.Page;
import com.gg.iterator.CiftSayiIterator;
import com.gg.memento.Form;
import com.gg.prototype.*;
import com.gg.proxy.*;
import com.gg.state.*;
import com.gg.state.Kahve;
import com.gg.strategy.*;

import com.gg.visitor.*;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

    @Test
    public void factoryPatternTest(){
        Asci asci = EgeliAsci.getInstance();

    }

    @Test
    public void prototypePatterntest(){
        Menu menu = new Menu();
        com.gg.prototype.Cay clone = menu.getTekSekerliCayCek();
        System.out.println("Seker Sayisi : " + clone.getSekerSayisi());
        System.out.println(menu.SABLON.getCayList() == clone.getCayList());
        clone.getCayList().add(new com.gg.prototype.Cay());
        System.out.println(menu.SABLON.getCayList().size());
        System.out.println("****************");
        clone = new com.gg.prototype.Cay(menu.SABLON);
        System.out.println("Seker Sayisi : " + clone.getSekerSayisi());
        System.out.println(menu.SABLON.getCayList() == clone.getCayList());
        clone.getCayList().add(new com.gg.prototype.Cay());
        System.out.println(menu.SABLON.getCayList().size());
    }

    @Test
    public void builderPatternTest() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = stringBuffer.append(1).append(true).append("xxx").toString();
        System.out.println(string);

        StringBuilder stringBuilder = new StringBuilder();
        String stringV2 = stringBuilder.append(1).append(true).append("asd").toString();
        System.out.println(stringV2);

    }

    @Test
    public void builderPatternTest2(){
        ProgramlanaBilirMenuBuilder builder = new ProgramlanaBilirMenuBuilderImpl();
        ProgramlanaBilirMenu menu = builder.addKomut(new TarhanaSiparis()).addKomut(new MantiSiparisi()).getProduct();
        menu.setVisible(true);
        try {
            System.in.read();
        } catch (IOException e) {

        }
    }

    /*@Test
    public void iteratorPatternTest(){
        ProgramlanaBilirMenuBuilder builder = new ProgramlanaBilirMenuBuilderImpl();
        ProgramlanaBilirMenu menu = builder.addKomut(new TarhanaSiparis()).addKomut(new MantiSiparisi()).getProduct();
        Iterator<SiparisKomutu> iterator = builder.getKomutlar().iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    } */

    @Test
    public void iteratorPatternTest(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> itr = new CiftSayiIterator(list);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }


    @Test
    public void visitorPatternTest() {
        A a1 = new A();
        A a2 = new B();

        Visitor visitor = new Visitor();
        visitor.visit(a1);
        visitor.visit(a2);

        Visitor subvisitor = new SubVisitor();
        //subvisitor.visit(a1);
        //subvisitor.visit(a2);

        a1.accept(subvisitor);
        a2.accept(subvisitor);
    }

    @Test
    public void visitorPatternTest2() {
        List<? extends Urun> alisverisSepeti = Arrays.asList(new Kola(2,2), new KolaBardakBirarada(),new KolaBardakBirarada());

        UrunVisitor urunVisitor = new UrunVisitor();
        for(Urun urun: alisverisSepeti){
            System.out.println(urun.toString());
            urun.accept(urunVisitor);
        }

        System.out.println(urunVisitor.getToplamFiyat());
    }

    @Test
    public void chainofrespPatternTest() {
        SatinAlma satinAlma = new SatinAlma();
        Request request = new Request();
        request.setMiktar(10000);
        System.out.println(satinAlma.onayla(request));
    }


    @Test
    public void mementoPatterntest() {
        Form f = new Form("Aziz", "Durmaz");
        Form.FormMemento memento =  f.createMemento();
        //save memento
        //load memento

        f = new Form(memento);
        System.out.println(f.toString());
    }

    @Test
    public void flyweightPatternTest() {
        Page p = new Page();
        for(int i= 0; i < 24*80; i++){
            p.addChar('A', i%24, i%80);
        }
    }

    @Test
    public void facadePatternTest() {
        MorgageServisi morgageServisi = new MorgageServisi();
        System.out.println(morgageServisi.basvur("123"));
    }
}
