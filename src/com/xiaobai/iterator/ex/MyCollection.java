package com.xiaobai.iterator.ex;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class MyCollection{
    private String[] elements;
    private int cursor = 0;

    public MyCollection(String[] elements) {

        this.elements = elements;
    }

    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public Iterator<String> iterator(){
        return new Itr();
    }

    class Itr implements Iterator<String>{
        @Override
        public boolean hasNext() {
            if (cursor >= elements.length || elements[cursor] == null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public String next() {
            if (cursor >= elements.length) {
                throw new ConcurrentModificationException();
            } else {
                return elements[cursor++];
            }
        }
    }
}
