package com.gg.factory.ege;

import com.gg.factory.Asci;
import com.gg.factory.Manti;
import com.gg.factory.Tarhana;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 9:26 AM
 */
public class EgeliAsci implements Asci {

    private static EgeliAsci INSTANCE = new EgeliAsci();
    //public final static EgeliAsci INSTANCE = new EgeliAsci();

    private EgeliAsci(){

    }

    public static final EgeliAsci getInstance(){
        return INSTANCE;
    }

    @Override
    public Tarhana createTarhana() {
        return new EgeUsuluTarhana();
    }

    @Override
    public Manti createManti() {
        return new EgeUsuluManti();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
