package com.xiaobai.decorate;

public class GraphicsDecorator implements ComponentDecorator {

    private Component component;

    public GraphicsDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String description() {
        return component.description()+",映众/微星 GTX1060";
    }

    @Override
    public double cost() {
        return component.cost()+1200;
    }
}
