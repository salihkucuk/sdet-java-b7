package day11;

public class MethodsPractice {
	public static void main(String[] args) {
		withinRange(7); // Within a range
		withinRange(9); // Within a range
		withinRange2(10); // Ten
		withinRange(17); // Out of range
		withinRange(1000); // Out of range
		withinRange(5); // Out of range
		
		System.out.println(min(1, 2, 3)); // 1
		System.out.println(min(5, 2, 3)); // 2
		System.out.println(min(4, 4, 0)); // 0
		System.out.println(min(1, 1, 1)); // 1
		System.out.println(min(2, 2, 5)); // 2
	}
	
	/*
	 * return type: int
	 * name: min
	 * arguments: 3 int arguments
	 * 
	 * Create a method that accepts 3 int arguments and returns the smallest one
	 */
	//TODO
	
	public static int min(int a, int b, int c) {
		if(a<=b && a<=c) {
			return a;
			
		}
		if(b<=a&& b<=c) {
			return b;
		}
		return c;
		
	}
	
	
	/*
	 * Create a static method withinRane that will accept one int number as an argument.
	 * if argument number is within the range 7-14 inclusive, print "Within a range"
	 * except when argument number is 10 print "Ten"
	 * otherwise print "Out of range"
	 */
	public static void withinRange(int num) {
		if (num == 10) {
			System.out.println("Ten");
			return; // exits the method
		}
		
		if (num >= 7 && num <= 14) {
			System.out.println("Within the range");
		} else {
			System.out.println("Out of the range");
		}
	}
	
	public static void withinRange2(int num) {
		if (num >= 7 && num <= 14) {
			if (num == 10) {
				System.out.println("Ten");
			} else {
				System.out.println("Within the range");
			}
		} else {
			System.out.println("Out of the range");
		}
	}
	
}