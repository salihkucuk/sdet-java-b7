package day49;

import java.util.Arrays;

public class HanldeExceptionReview {
	public static void main(String[] args) {
		
		try {		
			System.out.println("Creating new array");
			int[] nums = new int[3];
			nums[1] = 7;
			nums[2] = 9;
			// nums[3] = 13;
			System.out.println("My array: " + Arrays.toString(nums));
			
			nums = null;
			System.out.println("Size: " + nums.length);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception was handled: " + e.getMessage());
			
		} catch(NullPointerException e) {
			System.out.println("Null pointer was handled: " + e.getMessage());
		}
		
		System.out.println("The end of the program");
	}
}