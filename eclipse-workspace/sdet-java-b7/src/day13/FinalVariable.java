package day13;

public class FinalVariable {
	public static void main(String[] args) {
		// we can create local final variables
		final String name = "John Doe";
		System.out.println(name);
		
		// compilation error, cannot reassign final variables
		// name = "Alex Rodriguez";
		
		System.out.println(sum(1, 3)); // 4
	}
	
	// BREAK TILL 9:17PM EST
	// we make arguments as final when we know we don't have to change them
	public static int sum(final int a, final int b) {
		// a = 1; doesn't compile
		return a + b;
	}
}