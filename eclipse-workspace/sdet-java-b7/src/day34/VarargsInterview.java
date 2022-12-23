package day34;

public class VarargsInterview {
	public static void main(String[] args) {
		myMethod(5, 4); // in the method with 2 args
		
		myMethod(5, 4, 6); // in the method with varargs
		System.out.println("---");
		
		printStr("apple");
		System.out.println("---");
		
		// printStr(null); when single null is passed to varargs 
		//                 that means whole vararg is pointing to null
		
		printStr(null, null); // when multiple nulls then it is value for each element
	}
	
	public static void myMethod(int i, int i2) {
		System.out.println("in the method with 2 args");
	}
	
	public static void myMethod(int... nums) {
		System.out.println("in the method with varargs");
	}	
	
	//                                    strs -> [null, null]
	public static void printStr(String... strs) {
		for (String str : strs) {
			System.out.println(str);
		}
	}
}