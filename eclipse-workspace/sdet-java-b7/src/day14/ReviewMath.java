package day14;

public class ReviewMath {
	public static void main(String[] args) {
		// Math class is a helper class to do more advance math with formulas
		
		int num = -13;
		System.out.println(Math.abs(num));
		
		double dNum = 3.9;
		dNum = Math.floor(dNum); // round down
		System.out.println(dNum); // 3.0
		
		dNum = 4.1;
		dNum = Math.ceil(dNum); // round up
		System.out.println(dNum); // 5.0
		
		dNum = 5.6;
		dNum = Math.round(dNum);
		System.out.println(dNum); // 6.0
		
		dNum =  5.4;
		dNum = Math.round(dNum);
		System.out.println(dNum); // 5.0
		
		dNum =  9.5;
		dNum = Math.round(dNum);
		System.out.println(dNum); // 10
		
		System.out.println(Math.min(1, 7)); // 1
		System.out.println(Math.max(5, 2)); // 5
	}
}