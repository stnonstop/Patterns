package com.gg.iterator;

import java.util.List;

import java.util.Iterator;

/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 12:18 PM
 */
public class CiftSayiIterator implements Iterator<Integer> {

    private List<Integer> data;

    private int currentIndex = 0;
    private int currentValue;

    public CiftSayiIterator(List<Integer> data){
        super();
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return currentIndex > data.size();
    }

    private Integer doNext() {
        Integer value = null;
        do {
            if(!(currentIndex < data.size())) return null;
            value = null;
            value = data.get(currentIndex++);
        } while(value %2 != 0);
        return value;
    }

    @Override
    public Integer next(){
        return currentValue;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
