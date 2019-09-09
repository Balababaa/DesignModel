package com.xiaobai.decorate;

public class MemoryDecorator implements ComponentDecorator {

    private Component component;

    public MemoryDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String description() {
        return component.description()+",DDR4 2400 16GB";
    }

    @Override
    public double cost() {
        return component.cost()+800;
    }
}
