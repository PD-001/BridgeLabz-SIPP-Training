package com.bridgelab_oops_part2;

public class Person {
    // Attributes of the Person class
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}