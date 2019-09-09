package com.xiaobai.strategy;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(170,60, new Math());
        Student student2 = new Student(177, 65, new Computer());
        Student student3 = new Student(160, 50, new English());

        student1.introduce();
        student2.introduce();
        student3.introduce();
    }
}
