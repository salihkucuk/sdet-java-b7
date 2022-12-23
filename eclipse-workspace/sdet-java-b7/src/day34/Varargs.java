package day34;

public class Varargs {
	public static void main(String[] args) {
		int res = sum(5, 6);
		System.out.println(res);
		
		res = sum(1, 5, 9);
		System.out.println(res);
		
		int[] inputArr = {4, 3, 7, 8, 9};
		res = sum(inputArr);
		System.out.println(res);
		
		res = sum(9, 8, 10);
	}
	
	// 1. Varargs can be declared only in method argument
	// 2. It acts like a array inside the method
	// 3. When we call a method with varargs we can just list arguments 
	//    separating by comma
	public static int sum(int... nums) {
		int sum = 0;
		
		for (int num : nums) {
			sum += num;
		}
		
		return sum;
	}
}