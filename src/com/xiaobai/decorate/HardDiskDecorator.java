package com.xiaobai.decorate;

public class HardDiskDecorator implements ComponentDecorator {

    private Component component;

    public HardDiskDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String description() {
        return component.description()+",固态硬盘 480G";
    }

    @Override
    public double cost() {
        return component.cost()+400;
    }
}
