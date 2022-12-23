package day10;

public class MethodReview {
	public static void main(String[] args) {
		printHello3();
		printHello3();
		System.out.println("-----");
		
		print3("Abc");
		System.out.println("-----");
		print3("Xyz");
		System.out.println("-----");
		
		printSum(10, 12);
		printSum(999, 888);
		
		int a = 5;
		int b = 7;
		printSum(a, b);
		System.out.println("-------------------");
		
		int sum = getSum(9, 8);
		System.out.println("Sum: " + sum);
	}
	
	public static int getSum(int numOne, int numTwo) {
		int res = numOne + numTwo;
		return res;
	}
	
	public static void printSum(int numOne, int numTwo) {
		int res = numOne + numTwo;
		System.out.println(res);
	}
	
	public static void printHello3() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
	
	public static void print3(String str) {
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
	}
}
