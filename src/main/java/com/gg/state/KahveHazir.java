package com.gg.state;

/**
 * User: adurmaz
 * Date: 4/26/13
 * Time: 1:55 PM
 */
public class KahveHazir extends DefaultState {

    private KahveOtomatiStateImpl kahveOtomatiState;

    public KahveHazir(KahveOtomatiStateImpl kahveOtomatiState){
        this.kahveOtomatiState = kahveOtomatiState;
    }

    @Override
    public Kahve kahveyiAl() throws IllegalStateException{

        kahveOtomatiState.bakiye = kahveOtomatiState.bakiye .subtract(kahveOtomatiState.ucret);
        if(kahveOtomatiState.bakiye.compareTo(kahveOtomatiState.ucret) >= 0) {
            kahveOtomatiState.currentState = new BakiyeYeterli(kahveOtomatiState);
        }  else {
            kahveOtomatiState.currentState = new BakiyeYetersiz(kahveOtomatiState);
        }
        return new Kahve();

    }

}
