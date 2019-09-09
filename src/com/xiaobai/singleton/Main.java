package com.xiaobai.singleton;

public class Main {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
        new Thread(()-> System.out.println(ForSingleton.INSTANCE.getInstance())).start();
    }
}
