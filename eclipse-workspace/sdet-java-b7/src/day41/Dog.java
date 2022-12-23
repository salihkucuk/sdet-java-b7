package day41;

// - Encapsulation is data hiding mechanism
// - We achieve it by making our properties private 
//   and providing public getters and setters
public class Dog {
	private String name;
	private int age = 1;
	
	// need to provide public getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Invalid age: " + age);
		} else {
			this.age = age;
		}
	}
	
}