package day27;

public class StudentDemo {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.fullName = "John Doe";
		
		// we use class name to call static variables
		Student.address = "101 Main st";
		
	
		System.out.println(obj.fullName); // John Doe
		
		System.out.println(Student.address); // 101 Main st
		System.out.println("--");
		
		Student objTwo = new Student();
		System.out.println(objTwo.fullName); // null
		
		System.out.println(Student.address); // 101 Main st
	}
}