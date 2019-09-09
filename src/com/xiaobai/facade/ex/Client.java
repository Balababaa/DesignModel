package com.xiaobai.facade.ex;

import java.io.IOException;

public class Client {
    private APIGetway apiGetway;

    public Client(APIGetway apiGetway) {
        this.apiGetway = apiGetway;
    }

    public void sendRequest(String request){
        try {
            apiGetway.forward(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
