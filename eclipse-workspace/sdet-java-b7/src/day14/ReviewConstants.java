package day14;

public class ReviewConstants {
	// this is global constanta 
	public static final int CONST_VALUE = 10;
	
	public static void main(String[] args) {
		// 1. Constants in Java & final keyword
		
		System.out.println(CONST_VALUE);
		
		// cannot change value of final const variables
		// CONST_VALUE = 15; compilation error
		
		final String name = "John Doe";
		System.out.println(name); // John Doe
		// name = "Alex"; compilation error
		
		printName("Alex");
	}
	
	public static void printName(final String name) {
		System.out.println(name);
	}
}