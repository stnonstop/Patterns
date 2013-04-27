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

    /**
     * Volatile sayesinde atomik bir yapıya kavuşur.
     */
    private volatile static TrakyaliAsci INSTANCE;

    private TrakyaliAsci(){

    }

    /**
     * synchronized treath save hale getirir lock alıp bitinceye kadar başka treathler giremez.
     *
     * en alttakinde double check sayesinde daha az başka threathler
     *
     * @return
     */
    /*public synchronized static final TrakyaliAsci getInstance() {

        if(INSTANCE == null) {
            INSTANCE = new TrakyaliAsci();
        }
        return INSTANCE;
    } */
     /*
    public static final TrakyaliAsci getInstance() {
        synchronized (TrakyaliAsci.class) {
            if(INSTANCE == null) {
                INSTANCE = new TrakyaliAsci();
            }
            return INSTANCE;
        }
    }  */

    public static final TrakyaliAsci getInstance() {
        if(INSTANCE == null) {
            synchronized (TrakyaliAsci.class) {
                if(INSTANCE == null) {
                    INSTANCE = new TrakyaliAsci();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Tarhana createTarhana() {
        return new TrakyaUsuluTarhana();
    }

    @Override
    public Manti createManti() {
        return new TrakyaUsuluManti();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
