package com.gg.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 3:52 PM
 */
public class CharFactory {
    public static  final CharFactory INSTANCE = new CharFactory();

    private static Map<Integer,Character> characterMap = new HashMap<Integer, Character>();

    private CharFactory(){}

    public static Character getChar(char c) {
        if(characterMap.containsKey(c)) {
            return characterMap.get(c);
        } else {
            Character character = new Character(c);
            characterMap.put(new Integer(c), character);
            return character;
        }
    }
}
