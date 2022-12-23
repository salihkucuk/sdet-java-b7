package day05;

public class ArithmeticOperators {
	public static void main(String[] agrs) {
		// we can use arithmetic operators with numeric data types
		// byte, short, int, long
		// float, double
		
		// +, -, *, /
		// %
		
		int numberOne = 7;
		int numberTwo = 2;
		
		//   9              7 + 2
		int result = numberOne + numberTwo;
		System.out.println("result: " + result); // 9
		System.out.println("numberOne: " + numberOne);
		System.out.println("numberTwo: " + numberTwo);
		
		//  5  =         7 - 2
		result = numberOne - numberTwo;
		System.out.println("result: " + result);
		
		//  14 =         7 * 2
 		result = numberOne * numberTwo;
		System.out.println("result: " + result);
		
		//  3  =         7 / 2 
		result = numberOne / numberTwo;
		System.out.println("result: " + result);
		
		// whole number only for whole numbers
		// int / int = int
		double dResult = numberOne / numberTwo;
		System.out.println("double result: " + dResult);
		
		// int / double = double
		// int / float = float
		// short / double = double
		dResult = numberOne / 2.0;
		System.out.println(dResult);
	}
}