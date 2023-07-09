package Prereq_OOP;

public class Human {

	String fullName;
	int actualAge;
	int heightInInches;
	String eyeColor;
	
	public Human(String fullName, int actualAge, int heightInInches, String eyeColor) {
		super();
		this.fullName = fullName;
		this.actualAge = actualAge;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hello, my name is " + fullName);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("I am " + actualAge + " years old");
		System.out.println("My eye color is " + eyeColor);
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}
}
