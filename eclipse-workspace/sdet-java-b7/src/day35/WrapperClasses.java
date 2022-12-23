package day35;

public class WrapperClasses {
	public static void main(String[] args) {
		// primitives - Wrapper classes
		// byte       - Byte
		// short      - Short
		// int        - Integer
		// float      - Float
		// double     - Double
		// char       - Character
		// boolean    - Boolean
		
		Integer num = 100;
		num++;
		System.out.println(num);
		
		String strAge = "26";
		int age = Integer.parseInt(strAge);
		Integer wAge = Integer.valueOf(strAge);
		System.out.println("Age: " + age);
		System.out.println("Wrapper age: " + wAge);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Character
		char ch = '9';
		if (Character.isDigit(ch)) {
			System.out.println("Yes, it is digit: " + ch);
		} else {
			System.out.println("No, it is not digit: " + ch);
		}
		
		char chTwo = '!';
		if (Character.isAlphabetic(chTwo)) {
			System.out.println("Yes, it is alphabetic: " + chTwo);
		} else {
			System.out.println("No, it is not alphabetic: " + chTwo);
		}
		System.out.println("---");
		
		Short shNum = 8;
		short shNumTwo = shNum;
		
		double dNum = 29.9;
		Double dNumTwo = dNum;
		
	}
}