package com.xiaobai.decorate;

public class CPUDecorator implements ComponentDecorator{

    private Component component;

    public CPUDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String description() {
        return component.description()+",Intel i7 8700";
    }

    @Override
    public double cost() {
        return component.cost()+900;
    }
}
