package com.xiaobai.facade.ex;

public class ServiceC implements Service{

    @Override
    public void server() {
        System.out.println("Request reached SERVICE-B!");
    }

}
