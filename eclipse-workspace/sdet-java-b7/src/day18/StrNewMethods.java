package day18;

public class StrNewMethods {
	public static void main(String[] args) {
		// These methods are available from Java 11
		
		// isBlank() returns true if string is empty or consist of white spaces only
		String str = "  ";
		System.out.println(str.isEmpty()); // false
		System.out.println(str.isBlank()); // true
		
		// repeat(int count) returns string value repeated count times
		String name = "John";
		System.out.println(name);
		
		String nameRepeat = name.repeat(3);
		System.out.println(nameRepeat);
	}
}