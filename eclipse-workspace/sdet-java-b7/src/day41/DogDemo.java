package day41;

public class DogDemo {
	public static void main(String[] args) {
		Dog dog = new Dog();
//		dog.name = "Tuzik";
// 		dog.age = -5;
		
		dog.setName("Tuzik");
		dog.setAge(5);
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println("--");
		
		Dog dogTwo = new Dog();
		dogTwo.setName("Sharik");
		dogTwo.setAge(-2); // 
		
		System.out.println(dogTwo.getName());
		System.out.println(dogTwo.getAge());
	}
}