package com.xiaobai.decorate;

public class PowerDecorator implements ComponentDecorator{

    private Component component;

    public PowerDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String description() {
        return component.description()+",电源500W";
    }

    @Override
    public double cost() {
        return component.cost()+400;
    }
}
