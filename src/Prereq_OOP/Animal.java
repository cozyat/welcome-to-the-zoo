package Prereq_OOP;

import java.util.Scanner;
@SuppressWarnings("unused")

public class Animal {
	
	String commonName;
	String scientificName;
	String dietType;
	String favoriteFood;
	int weightInLbs;
	
public Animal(String commonName, String scientificName, String dietType, String favoriteFood, int weightInLbs) {
		super();
		this.commonName = commonName;
		this.scientificName = scientificName;
		this.dietType = dietType;
		this.favoriteFood = favoriteFood;
		this.weightInLbs = weightInLbs;
	}

public void giveFacts() {
	System.out.println("This animal's common name is= known as the " + commonName);
	System.out.println("");
	System.out.println("This animal's scientific name is known as the " + scientificName);
	System.out.println("");
	System.out.println("The " + commonName.toLowerCase() + "'s diet type is classified as a " + dietType);
	System.out.println("");
	System.out.println("The " + commonName.toLowerCase() + "'s favorite food is " + favoriteFood);
	System.out.println("");
	System.out.println("The " + commonName.toLowerCase() + "'s weight in pounds is " + weightInLbs + " lbs");
	System.out.println("");
	
	}

public void doActionByEating() {
	System.out.println("The " + commonName.toLowerCase() + " is eating some " + favoriteFood);
}

public void doActionByPlaying() {
	System.out.println("The " + commonName.toLowerCase() + " is playing");
}

public void doActionByFlying() {
	System.out.println("The " + commonName.toLowerCase() + " is flying around in their cage");
}

public void doActionBySleeping() {
	System.out.println("The " + commonName.toLowerCase() + " is sleeping for a couple of hours");
}

public void move() {
}

}