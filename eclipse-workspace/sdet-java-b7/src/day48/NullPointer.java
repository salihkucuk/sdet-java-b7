package day48;

public class NullPointer {
	public static void main(String[] args) {
		// NullPointerException happens when object reference
		// is pointing to null and we try to use some 
		// properties or methods for that reference.
		
		String str = null;
		System.out.println(str);
		System.out.println("In line 11");
		str = str.toUpperCase(); // java.lang.NullPointerException here
		System.out.println("In line 13"); // this line never runs
		// Exception stops the execution
	}
}