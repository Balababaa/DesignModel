package com.xiaobai.decorate;

public class FanDecorator implements ComponentDecorator {

    private Component component;

    public FanDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String description() {
        return component.description()+",风冷";
    }

    @Override
    public double cost() {
        return component.cost()+50;
    }
}
