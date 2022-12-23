package day39;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		int[] arrNums = {4, 3, 2, 1, 8};
		int[] arrNumsTwo = {1, 8, 8, 9};
		
		// 1. Create array that can hold values from both arrays
		int[] arrMerged = new int[arrNums.length + arrNumsTwo.length];

		// 2. Assign values to new array from two arrays
		for (int i = 0; i < arrNums.length; i++) {
			arrMerged[i] = arrNums[i];
		}
	
		for (int i = 0; i < arrNumsTwo.length; i++) {
			arrMerged[arrNums.length + i] = arrNumsTwo[i];
		}
		
		// 3. Print new array
		System.out.println(Arrays.toString(arrMerged));
		
		// 4. Get sum of new array
		int sum = 0;
		for (int num : arrMerged) {
			sum += num;
		}
		System.out.println("Sum: " + sum);
		
		// [4, 3, 2, 1, 8, 1, 8, 8, 9] 
		// Sum: 44
		
		// TODO
		// Create one more array that will have values 
		// from first array(arrNums) and seconds array(arrNumsTwo)
		// and print that new array by using Arrays.toString();
		
		// TODO
		// Find out total sum of all values
		
	
	}
}