package day34;

public class VarargsInterviewTwo {
	public static void main(String[] args) {
		myMethod(7, 5, 6); // 5
		
		myMethod(9, 8, 7, 6); // 8
		
		int[] arrNum = {9, 9, 9, 1}; 
		myMethod(arrNum); // 9
		
		// myMethod(1); // out of bound exception
		System.out.println("---");
		
		myMethodTwo(7, 5, 6); // 3
		myMethodTwo(9, 8, 7, 6); //  4
		myMethodTwo(arrNum);  // 4
		myMethodTwo(5); // 1
	}

	public static void myMethod(int... numbers) {
		System.out.println(numbers[1]);
	}
	
	public static void myMethodTwo(int... numbers) {
		System.out.println(numbers.length);
	}
}