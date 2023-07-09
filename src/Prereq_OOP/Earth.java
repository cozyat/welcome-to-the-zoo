package Prereq_OOP;

public class Earth {

	public static void main(String[] args) {
		
		Human human1 = new Human("Tom", 45, 77, "Blue");
		Human human2 = new Human("Sid", 39, 61, "Brown");
		Human human3 = new Human("Joe", 21, 54, "Hazel");
		
		human1.speak();
		human2.speak();
		human3.speak();
		
	}

}


// String fullName, int actualAge, int heightInInches, String eyeColor