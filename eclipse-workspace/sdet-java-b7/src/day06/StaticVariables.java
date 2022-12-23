package day06;

public class StaticVariables {
	public static String name = "John Doe";
	public static int age = 25;
	
	public static void main(String[] args) {
		/*
		 * Static variables are global variables.
		 * They belong to class itself not to specific object.
		 */
		
		System.out.println(name);
		System.out.println(age);
		
		age = 27;
		System.out.println(name);
		System.out.println(age);
	}
}