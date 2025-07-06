package com.inheritance.introduction.animalhierarchy;

public class Main {
	public static void main(String[] args) {
		// Create an Object of Animal,Bird,Cat and Dog Class
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();

		// Access sound methods of each
		animal.makeSound();

		dog.name = "Rocky";
		dog.age = 5;
		dog.makeSound();

		cat.name = "Meow";
		cat.age = 2;
		cat.makeSound();

		bird.name = "John";
		bird.age = 3;
		bird.makeSound();
	}
}
