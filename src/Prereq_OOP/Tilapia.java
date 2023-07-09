package Prereq_OOP;

public class Tilapia extends Fish {

	public Tilapia(String commonName, String scientificName, String dietType, String favoriteFood, int weightInLbs) {
		super(commonName, scientificName, dietType, favoriteFood, weightInLbs);
	}
	
	public void doActionBySwimming() {
		System.out.println("The " + commonName.toLowerCase() + " is swimming in a small pool");
	}
}
