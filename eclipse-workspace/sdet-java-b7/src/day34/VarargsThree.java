package day34;

public class VarargsThree {
	public static void main(String[] args) {
		myMethod("Hello World!"); // str="Hello World!", numbers = {}
		System.out.println("---");
		
		myMethod("Hello World!", 1); // str="Hello World!", numbers = {1}
		System.out.println("---");
		
		myMethod("Hello World!", 1, 2, 3); // str="Hello World!", numbers = {1, 2, 3}
	}
	
	// 1. We can have only one vararg per method
//	public static void myMethod(String... strs, int... numbers) {
//		
//	}
	
	// 2. Vararg should last argument in the method
	public static void myMethod(String str, int... numbers) {
		System.out.println(str);
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	
//	public static void myMethod(int... numbers, String str) {
//		
//	}
}