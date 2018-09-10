package com.sidenis.robots;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("Cat " + this.name + " is moving");
    }
}
