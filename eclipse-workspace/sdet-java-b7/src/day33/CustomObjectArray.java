package day33;

public class CustomObjectArray {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(1, "John");
		students[1] = new Student(2, "Alex");
		students[2] = new Student(3, "Kuba");
		
		// [{id=1, name="John"}, {id=2, name="Alex"}, {id=3, name="Kuba"}]
		
		for (Student student : students) {
			System.out.println("id: " + student.id);
			System.out.println("name: " + student.name);
			System.out.println("---");
		}
	}
}

class Student {
	public long id;
	public String name;
	
	public Student(long id, String name) {
		this.id = id;
		this.name = name;
	}
}