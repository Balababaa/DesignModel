package com.xiaobai.observer;

import java.util.ArrayList;
import java.util.Observable;

public class Publisher extends Observable {
    private ArrayList<String> books;

    Publisher(){
        books = new ArrayList<>();
    }

    public void addBook(String book){
        books.add(book);
        super.setChanged();
        super.notifyObservers();
    }

    public ArrayList<String> getBooks() {
        return books;
    }
}
