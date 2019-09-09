package com.xiaobai.observer;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        publisher.addObserver(new Subscriber("A"));
        publisher.addObserver(new Subscriber("B"));
        publisher.addObserver(new Subscriber("C"));

        publisher.addBook("数据结构");
        publisher.addBook("操作系统");
        publisher.addBook("模拟电路");

    }
}
