package day13;

public class MathClass {
	public static void main(String[] args) {
		// Math.abs(int a), Math.abs(long a), Math.abs(float a), Math.abs(double a)
		// it returns the absolute(positive) value of argument
		
		int num = Math.abs(10);
		System.out.println(num);
		
		num = Math.abs(-99);
		System.out.println(num);
		
		System.out.println(isDiffMore10(99, 50));
		System.out.println(isDiffMore10(50, 99));
		
		// Math.ceil(double) method
		// It rounds a decimal point value up to the nearest whole integer value
		double c = 3.1;
		c = Math.ceil(c);
		System.out.println(c);
		
		// Math.floor(double) method
		// It rounds down a decimal point value to nearest whole integer value
		double f = 8.99;
		f = Math.floor(f);
		System.out.println(f);
		
		// Math.round(double) method
		// It rounds decimal point value
		double value = 23.445;
		value = Math.round(value);
		System.out.println(value);
		
		value = 23.501;
		value = Math.round(value);
		System.out.println(value);
		
		value = 1.5;
		// if it is in the middle, it will round up
		value = Math.round(value);
		System.out.println(value);
		System.out.println("------------");
		
		System.out.println(Math.min(1, 2)); // 1
		System.out.println(Math.min(2.5, 5.6)); // 2.5
		
		System.out.println(Math.max(9, 14)); // 14
		System.out.println(Math.max(100, 50)); // 100
		System.out.println(Math.max(8.2, 9.1)); // 9.1
	}
	
	public static boolean isDiffMore10(int a, int b) {
		int res = Math.abs(a - b);
		return res > 10;
	}
}