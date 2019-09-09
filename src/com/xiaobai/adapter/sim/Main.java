package com.xiaobai.adapter.sim;

public class Main {

    public static void main(String[] args) {
        Earphone earphone = new Earphone();
        Charging charging = new ChargingEarphoneAdapter(earphone);
        charging.charge();
    }

}
