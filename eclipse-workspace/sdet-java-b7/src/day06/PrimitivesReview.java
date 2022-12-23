package day06;

public class PrimitivesReview {
	public static void main(String[] args) {
		// Variable is container that can hold piece of data
		// DataType nameOfVariable;
		
		// There are 8 core data type in java
		// We call them primitives
		// Whole numbers: byte, short, int, long 
		// What's the difference between above primitives?
		// They can hold different range of values where byte is the smallest
		// and long is the biggest.
		
		// float, double 
		// They can hold decimal point numbers
		
		// char
		// It is for single character
		// Every char has numeric value from ACII table
		
		// boolean
		// It can hold logical value (true or false)
		
		String name = "John";
		int age = 37;
		int value = 10;
		
		System.out.println(age + value); // 47
		// concat and plus expressions are evaluated from left to right
		System.out.println("Total value: " + (age + value));
		
		// wholeNumber / wholeNumber = wholeNumber
		int i = 5;
		int i2 = 2;
		//                 5 / 2 = 2
		System.out.println(i / i2); // 2
		
		double result = i / i2; 
		System.out.println(result); // 2.0
		
		// int / double = double
		// double / int = double
		double i3 = 2.0;
		System.out.println(i / i3); 
	}
}
