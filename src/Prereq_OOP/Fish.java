package Prereq_OOP;

// extends shows that the class Fish extends a class (indicates that class Fish is inherited from class Animal)

public class Fish extends Animal {

	// A constructor (can be generated without typing in the Eclipse IDE dropdown menus)
	
	public Fish(String commonName, String scientificName, String dietType, String favoriteFood, int weightInLbs) {
		super(commonName, scientificName, dietType, favoriteFood, weightInLbs);
	}

	public void doActionBySwimming() {
		System.out.println("The " + commonName.toLowerCase() + " is swimming in a small pool");
		
	}

	@Override
	public void move() {
		
	}
}
