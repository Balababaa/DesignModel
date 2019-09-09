package com.xiaobai.factory;

import com.xiaobai.factory.cpu.CPU;

public class CPUFactory implements Factory{
    @Override
    public Component createComponent()  {
        return new CPU();
    }
}
