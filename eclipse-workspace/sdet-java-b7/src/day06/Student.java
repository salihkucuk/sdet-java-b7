package day06;

public class Student {
	public static final double PERCENTAGE =0.08;
	public static void main(String[] args) {
		
		String name="Jack";
		double grade =100.0;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
		
		double percentToAdd= grade * PERCENTAGE;
		grade= grade+percentToAdd;
		
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
		
		
		
	}

}
