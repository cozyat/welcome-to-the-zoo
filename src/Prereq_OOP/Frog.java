package Prereq_OOP;

public class Frog extends Fish {

	public Frog(String commonName, String scientificName, String dietType, String favoriteFood, int weightInLbs) {
		super(commonName, scientificName, dietType, favoriteFood, weightInLbs);
	}
	
	public void doActionBySwimming() {
		System.out.println("The " + commonName.toLowerCase() + " is floating in a small pool");	
	}
}
