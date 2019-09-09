package com.xiaobai.adapter.sim;

public class ChargingEarphoneAdapter implements Charging {
    private Earphone earphone;

    public ChargingEarphoneAdapter(Earphone earphone) {
        this.earphone = earphone;
    }

    @Override
    public void charge() {
        earphone.listenToMusic();
    }
}
