package com.xiaobai.factory;

import com.xiaobai.factory.memory.Memory;

public class MemoryFactory implements Factory {
    @Override
    public Component createComponent() {
        return new Memory();
    }
}
