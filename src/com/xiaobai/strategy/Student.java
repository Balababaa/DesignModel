package com.xiaobai.strategy;

public class Student {
    public double height;
    public double weight;
    Major major;

    public Student(double height, double weight, Major major) {
        this.height = height;
        this.weight = weight;
        this.major = major;
    }

    public Student(Major major) {
        this(0, 0, major);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public void introduce() {
        System.out.println("height=" + height + ", " + "weight=" + weight + ", "+major.majorIn());
    }
}