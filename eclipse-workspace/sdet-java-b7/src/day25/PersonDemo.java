package day25;

public class PersonDemo {
	public static void main(String[] args) {
		Person personOne = new Person("John", 27);
		Person personTwo = new Person("John", 27);
		
		// == operator
		// - we can use == to compare primitives on equality
		// - when it used with two object references, it will
		//   check if they are pointing to the same object or not
		//   if they are then it returns true otherwise false
		
		System.out.println(personOne);
		System.out.println(personTwo);
		
		
		// are these two references pointing to the same object
		// in the memory?
		if (personOne == personTwo) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("---");
		// personThree point to the same object where personOne is pointing
		Person personThree = personOne;
		
		if (personOne == personThree) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("---");
		
		personThree.name = "Smith";
		personThree.age = 25;
		
		System.out.println(personOne.name);
		System.out.println(personOne.age);
	}
}