package day41;

public class PersonDemo {
	public static void main(String[] args) {
		// new Person(); calls the constructor to create this object
		Person objOne = new Person();
		objOne.firstName = "John";
		objOne.lastName = "Doe";
		objOne.age = 30;
		
		String fullName = objOne.getFullName();
		System.out.println(fullName); // John Doe
		
		// {firstName="Kuba", lastName="Zhaanbaev", age=33, 
		//     getFullName(), increaseAge(int amount)}
		
		Person objTwo = new Person();
		objTwo.firstName = "Kuba";
		objTwo.lastName = "Zhaanbaev";
		objTwo.age = 33;
		
		System.out.println(objTwo.getFullName()); // Kuba Zhaanbaev
		System.out.println(objOne.getFullName()); // John Doe
		
		Person objThree = new Person();
		System.out.println(objThree.getFullName());
		System.out.println(objThree.age);
		
		System.out.println("---");
		
		Person objFour = new Person("Bek", "Suranchiyev", 27);
		System.out.println(objFour.getFullName());
		
	}
}