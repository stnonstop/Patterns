package com.gg.factory;

import com.gg.factory.ege.EgeliAsci;
import com.gg.factory.trakya.TrakyaliAsci;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 9:36 AM
 */
public class AsciFactory {
    private static final EgeliAsci EGELI_ASCI = new EgeliAsci();
    private static final TrakyaliAsci TRAKYALI_ASCI = new TrakyaliAsci();

    public static Asci createEgeliAsci() {
        return EGELI_ASCI;
    }

    public static Asci createTrakyaliAsci() {
        return TRAKYALI_ASCI;
    }
}
