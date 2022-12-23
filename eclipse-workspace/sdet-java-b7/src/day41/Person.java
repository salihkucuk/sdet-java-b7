package day41;

// Java class is a blueprint/pattern for objects
public class Person {
	public String firstName;
	public String lastName;
	public int age;
	
	// constructor is a special method to create
	// an object in java.
	public Person() {
		System.out.println("in the empty constructor");
	}
	
	public Person(String firstName, String lastName, int age) {
		System.out.println("in the constructor with 3 args");
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public void increaseAge(int amount) {
		age += amount;
	}

}