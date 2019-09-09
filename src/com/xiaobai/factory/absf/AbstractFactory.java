package com.xiaobai.factory.absf;

import com.xiaobai.factory.cpu.CPU;
import com.xiaobai.factory.fan.Fan;
import com.xiaobai.factory.graphics.Graphics;
import com.xiaobai.factory.harddisk.HardDisk;
import com.xiaobai.factory.memory.Memory;
import com.xiaobai.factory.motherboard.Motherboard;
import com.xiaobai.factory.power.Power;

public interface AbstractFactory {
    CPU createCPU();
    Fan createFan();
    Graphics createGraphics();
    HardDisk createHardDisk();
    Memory createMemory();
    Motherboard createMotherboard();
    Power createPower();
}
