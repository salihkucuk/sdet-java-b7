package day34;

public class WrapperClass {
	public static void main(String[] args) {
		// Wrapper classes are object representation of primitives in java
		// byte       Byte
		// short      Short
		// int        Integer
		// long       Long
		// float      Float
		// double     Double
		// char       Character
		// boolean    Boolean
		
		// Some java features as Collections, Generics they can work only with objects
		// that's the reason we have object representation of primitives in java as Wrapper Classes
		
		byte bNum = 5;
		System.out.println(bNum);
		
		Byte bNum2 = 7;
		System.out.println(bNum2);
		
		Short shNum = 200;
		System.out.println(shNum);
		
		Integer num = 100;
		num = num + 10;
		num += 10;
		num++;
		num--;
		System.out.println("---");
		
		String strNum = "17";
		Integer numTwo = Integer.valueOf(strNum);
		
		System.out.println("int max value: " + Integer.MAX_VALUE);
		System.out.println("int min value: " + Integer.MIN_VALUE);
	}
}