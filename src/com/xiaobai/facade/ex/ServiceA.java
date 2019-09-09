package com.xiaobai.facade.ex;

public class ServiceA implements Service {
    @Override
    public void server() {
        System.out.println("Request reached SERVICE-A!");
    }
}
