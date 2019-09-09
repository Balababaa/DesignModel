package com.xiaobai.decorate;

public class Main {
    public static void main(String[] args) {
        Component computer = new Motherboard();
        computer= new CPUDecorator(computer);
        computer = new GraphicsDecorator(computer);
        computer = new MemoryDecorator(computer);
        computer = new MemoryDecorator(computer);
        computer = new HardDiskDecorator(computer);
        computer = new FanDecorator(computer);
        computer = new PowerDecorator(computer);

        System.out.println(computer.description()+"\n"+computer.cost());
    }
}
