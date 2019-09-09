package com.xiaobai.singleton;

public enum ForSingleton {
    INSTANCE;
    private Singleton singleton;

    private ForSingleton() {
        singleton = new Singleton();
    }

    public Singleton getInstance() {
        return singleton;
    }
}
