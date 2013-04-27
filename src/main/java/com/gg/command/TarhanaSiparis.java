package com.gg.command;

import com.gg.factory.AsciFactory;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 11:24 AM
 */
public class TarhanaSiparis implements SiparisKomutu {
    @Override
    public String name() {
        return "Tarhana";
    }

    @Override
    public void execute() {
        System.out.println(AsciFactory.createTrakyaliAsci().createTarhana());
    }
}
