package com.bridgelab_oops_part2;

public class PersonMain {
	public static void main(String[] args) {
		// Create original person
		Person person1 = new Person("Alice", 28);
		person1.displayInfo();

		System.out.println();

		// using copy constructor
		Person person2 = new Person(person1);
		person2.displayInfo();
	}
}
