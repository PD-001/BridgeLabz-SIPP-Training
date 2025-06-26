package com.bridgelab_oops_part2;

public class CircleMain {
    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        defaultCircle.displayInfo();

        System.out.println();

        // Using parameterized constructor
        Circle customCircle = new Circle(4.5);
        customCircle.displayInfo();
    }

}
