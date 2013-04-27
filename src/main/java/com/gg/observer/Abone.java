package com.gg.observer;

import java.util.Observer;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 4:53 PM
 */
public interface Abone extends Observer {
    void update(String mesaj);
}
