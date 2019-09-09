package com.xiaobai.facade.ex;

public class Main {
    public static void main(String[] args) {
        APIGetway apiGetway = new APIGetway();
        apiGetway.addService("SERVICE-A",new ServiceA());
        apiGetway.addService("SERVICE-B",new ServiceB());
        apiGetway.addService("SERVICE-C",new ServiceC());

        Client client = new Client(apiGetway);

        client.sendRequest("SERVICE-A");
        client.sendRequest("SERVICE-B");
        client.sendRequest("SERVICE-C");
    }
}
