package com.xiaobai.iterator.ex;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ExampleA implements Iterator {
    private String[] components;
    private int cursor = 0;

    public ExampleA(String[] components) {
        components = components;
    }

    public String[] getComponents() {
        return components;
    }

    public void setComponents(String[] components) {
        this.components = components;
    }

    @Override
    public boolean hasNext() {
        if (cursor >= components.length || components[cursor] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if (cursor >= components.length){
            throw new ConcurrentModificationException();
        }else{
            return components[cursor++];
        }
    }
}
