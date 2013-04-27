package com.gg.chainofresp;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 3:10 PM
 */
public class BaskanYardimcisi extends Management{

    public BaskanYardimcisi(Management successor){
        super(successor);
    }

    @Override
    public boolean onayla(Request request) {
        if(request.getMiktar() < 50000){
            return true;
        } else {
            return successor.onayla(request);
        }
    }
}
