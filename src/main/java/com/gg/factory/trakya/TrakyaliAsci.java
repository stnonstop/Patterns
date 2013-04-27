package com.gg.factory.trakya;

import com.gg.factory.Asci;
import com.gg.factory.Manti;
import com.gg.factory.Tarhana;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 9:26 AM
 */
public class TrakyaliAsci implements Asci {
    @Override
    public Tarhana createTarhana() {
        return new TrakyaUsuluTarhana();
    }

    @Override
    public Manti createManti() {
        return new TrakyaUsuluManti();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
