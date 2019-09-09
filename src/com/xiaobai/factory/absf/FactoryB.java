package com.xiaobai.factory.absf;

import com.xiaobai.factory.cpu.CPU;
import com.xiaobai.factory.cpu.CPUB;
import com.xiaobai.factory.fan.Fan;
import com.xiaobai.factory.fan.FanB;
import com.xiaobai.factory.graphics.Graphics;
import com.xiaobai.factory.graphics.GraphicsB;
import com.xiaobai.factory.harddisk.HardDisk;
import com.xiaobai.factory.harddisk.HardDiskB;
import com.xiaobai.factory.memory.Memory;
import com.xiaobai.factory.memory.MemoryB;
import com.xiaobai.factory.motherboard.Motherboard;
import com.xiaobai.factory.motherboard.MotherboardB;
import com.xiaobai.factory.power.Power;
import com.xiaobai.factory.power.PowerB;

public class FactoryB implements AbstractFactory {
    @Override
    public CPU createCPU() {
        return new CPUB();
    }

    @Override
    public Fan createFan() {
        return new FanB();
    }

    @Override
    public Graphics createGraphics() {
        return new GraphicsB();
    }

    @Override
    public HardDisk createHardDisk() {
        return new HardDiskB();
    }

    @Override
    public Memory createMemory() {
        return new MemoryB();
    }

    @Override
    public Motherboard createMotherboard() {
        return new MotherboardB();
    }

    @Override
    public Power createPower() {
        return new PowerB();
    }
}
