package com.gg.chainofresp;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 3:13 PM
 */
public class ProjeYoneticisi extends Management {

    public ProjeYoneticisi(Management successor){
        super(successor);
    }
    @Override
    public boolean onayla(Request request) {
        if(request.getMiktar() < 5000){
            return true;
        } else {
            return successor.onayla(request);
        }
    }
}
