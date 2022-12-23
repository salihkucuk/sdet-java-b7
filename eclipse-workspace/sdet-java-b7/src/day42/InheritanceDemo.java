package day42;

public class InheritanceDemo {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.firstName = "John";
		obj.lastName = "Doe";
		obj.age = 25;
		obj.studentId = 2;
		obj.course = "Java";
		System.out.println(obj.getFullName());
		System.out.println(obj.getAllDetails());
	}
}