package com.xiaobai.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new CPUFactory();
        Component AMDCPU = factory.createComponent();
        Component INTELCPU = factory.createComponent();
    }
}
