package com.xiaobai.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

    private String name;

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Publisher){
            Publisher publisher = (Publisher)o;

            System.out.print(name+" ");
            publisher.getBooks().stream().forEach(book -> System.out.print(book+" "));
            System.out.println();
        }
    }
}
