package com.xiaobai.decorate;

public class Motherboard implements Component{
    @Override
    public String description() {
        return "技嘉 M-ATX（紧凑型）";
    }

    @Override
    public double cost() {
        return 100;
    }
}
