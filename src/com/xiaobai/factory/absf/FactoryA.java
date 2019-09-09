package com.xiaobai.factory.absf;

import com.xiaobai.factory.cpu.CPU;
import com.xiaobai.factory.cpu.CPUA;
import com.xiaobai.factory.fan.Fan;
import com.xiaobai.factory.fan.FanA;
import com.xiaobai.factory.graphics.Graphics;
import com.xiaobai.factory.graphics.GraphicsA;
import com.xiaobai.factory.harddisk.HardDisk;
import com.xiaobai.factory.harddisk.HardDiskA;
import com.xiaobai.factory.memory.Memory;
import com.xiaobai.factory.memory.MemoryA;
import com.xiaobai.factory.motherboard.Motherboard;
import com.xiaobai.factory.motherboard.MotherboardA;
import com.xiaobai.factory.power.Power;
import com.xiaobai.factory.power.PowerA;

public class FactoryA implements AbstractFactory {
    @Override
    public CPU createCPU() {
        return new CPUA();
    }

    @Override
    public Fan createFan() {
        return new FanA();
    }

    @Override
    public Graphics createGraphics() {
        return new GraphicsA();
    }

    @Override
    public HardDisk createHardDisk() {
        return new HardDiskA();
    }

    @Override
    public Memory createMemory() {
        return new MemoryA();
    }

    @Override
    public Motherboard createMotherboard() {
        return new MotherboardA();
    }

    @Override
    public Power createPower() {
        return new PowerA();
    }
}
