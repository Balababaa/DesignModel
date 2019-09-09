package com.xiaobai.iterator.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ComputerShop {
    public static void main(String[] args) {
    }

    public void print(MyCollection myCollection) {
        String[] elements = myCollection.getElements();
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public void print(ArrayList<String> lists) {
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }

    public void print(Iterator iterator) {
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
