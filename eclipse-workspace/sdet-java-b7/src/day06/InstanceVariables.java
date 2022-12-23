package day06;

public class InstanceVariables {
	public String firstName;
	public String lastName;
	public int age;
	
	public static void main(String[] args) {
		/*
		 * Instance variables 
		 * 1. They are properties of objects, to use it, we need to create an object out of this class
		 * 2. We cannot call them directly in our main method
		 * 
		 */
		
		// System.out.println(firstName);
		
		InstanceVariables obj = new InstanceVariables();
		obj.firstName = "John";
		obj.lastName = "Doe";
		obj.age = 25;
		
	}
}