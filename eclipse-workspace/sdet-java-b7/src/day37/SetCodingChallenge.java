package day37;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCodingChallenge {
	public static void main(String[] args) {
		int[] numArr = {6, 3, 2, 7, 3, 3, 2, 1};
		System.out.println(Arrays.toString(numArr));
		// write the method that accepts array and returns new array with no
		// duplicates
		
		
		int[] arrRes = removeDuplicates(numArr);
		System.out.println(Arrays.toString(arrRes));
	}
	
	// [6, 3, 2, 7, 3, 3, 2, 1] -> [6, 3, 2, 7, 1]
	public static int[] removeDuplicates(int[] arr) {		
		// 1. create set
		Set<Integer> set = new LinkedHashSet<>();
		
		// 2. load all data from array to set
		for (int number : arr) {
			//         1
			set.add(number);
		}
		
		// 3. create new array with no duplicates size
		int[] arrNoDup = new int[set.size()];
		
		// 4. load data from set to new array and return it 
		int index = 0;
		for (int number : set) {
			arrNoDup[index++] = number;
		}
		
		return arrNoDup;
	}
}	