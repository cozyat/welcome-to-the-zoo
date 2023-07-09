package Prereq_OOP;

// No import due to both classes being in the same package
// Constructors for "Animal" is located in Animal.java
// The main file to run a configuration is in Zoo.java

public class Zoo {
	
	public static void main(String[] arg) {
		
		Animal animal1 = new Animal("Giant Panda", "Ailuropoda Melanoleuca", "herbivore", "bamboo", 210);
		Animal animal2 = new Animal("Domesticated Cat", "Felis Catus", "carnivore", "tuna", 13);
		Animal animal3 = new Animal("Mouse Lemur", "Microcebus Danfossi", "omnivore", "insects", 4);
		Animal animal4 = new Animal("American Goldfinch", "Spinus Tristis", "herbivore", "seeds", 1);
		Fish fish1 = new Fish("Channel Catfish", "Ictalurus Punctatus", "omnivore", "crustaceans", 55);
		
		
		
		System.out.println("Welcome to my zoo! Let me show you around our most competent, cute animals here today!");
		System.out.println("");
		System.out.println("");
		
		
		
		animal1.giveFacts();
		System.out.println("");
		
		animal2.giveFacts();
		System.out.println("");
		
		animal3.giveFacts();
		System.out.println("");
		
		animal4.giveFacts();
		System.out.println("");
		
		fish1.giveFacts();
		
		
		
		System.out.println("");
		System.out.println("What's happening in the zoo right now?");
		System.out.println("");
		System.out.println("");
		
		
		
		animal1.doActionByEating();
		System.out.println("");
		
		animal2.doActionBySleeping();
		System.out.println("");
		
		animal3.doActionByPlaying();
		System.out.println("");
		
		animal4.doActionByFlying();
		System.out.println("");
		
		fish1.doActionBySwimming();
		System.out.println("");
	}
}