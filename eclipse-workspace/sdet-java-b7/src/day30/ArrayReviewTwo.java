package day30;

import java.util.Arrays;

public class ArrayReviewTwo {
	public static void main(String[] args) {
		// go over the array with loop
		String[] names = {"Uran", "Nika", "Raven", "Daria", "Paul", "Mehmet"};
		
		// Find out total number of characters in the array?
		// Uran - 4
		// Nika - 4
		// Raven - 5
		// Daria - 5
		// Paul - 4
		// Mehmet - 6
		// 28
		
		System.out.println(Arrays.toString(names)); 
		//    0     1     2      3      4    5
		// [Uran, Nika, Raven, Daria, Paul, Mehmet]
		
		int numberOfTotalChars = 0;
		
		// loop over the array using for loop
		//              6 < 6 -> false
		for (int i = 0; i < names.length; i++) {
			//      "Mehmet" = names[5]
			String element = names[i];
			//              6  =  "Mehmet".length()
			int singleNameSize = element.length();
			//              28 +=
			numberOfTotalChars += singleNameSize;
		}
		
		System.out.println("Total number of chars: " + numberOfTotalChars);
	}
}