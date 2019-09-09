package com.xiaobai.factory.absf;

import com.xiaobai.factory.cpu.CPU;
import com.xiaobai.factory.fan.Fan;
import com.xiaobai.factory.harddisk.HardDisk;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new FactoryB();
        HardDisk hardDisk = abstractFactory.createHardDisk();
    }
}
