package com.gg.flyweight;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 3:51 PM
 */
public class Page {
    private Character[][] content = new Character[24][80];

    public void addChar(char c, int row, int col) {
        content[row][col] = CharFactory.INSTANCE.getChar(c);
    }
}
