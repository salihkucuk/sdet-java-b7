package day15;

public class StrUpperLowerCase {
	public static void main(String[] args) {
		// toUpperCase()
		// toLowerCase()
		
		String str = "java";
		System.out.println(str); // java
		
		// convert value of str to upper cases
		str = str.toUpperCase();
		System.out.println(str); // JAVA
		
		// convert value of str to lower cases
		str = str.toLowerCase();
		System.out.println(str); // java
		System.out.println("----");
		
		String name = "John Doe";
		System.out.println(name); // John Doe
		System.out.println(name.toUpperCase()); // JOHN DOE
		System.out.println(name); // John Doe
	}
}