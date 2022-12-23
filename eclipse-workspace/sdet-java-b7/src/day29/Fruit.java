package day29;

import java.util.Arrays;

public class Fruit {
	public static void main(String[] args) {
		// int[] score = new int[5];
		
		String[] fruit = new String[4];
		// [null, null, null, null]
		fruit[0] = "orange";
		fruit[1] = "kiwi";
		fruit[2] = "banana";
		fruit[3] = "apple";
		//     0        1         2        3
		// ["orange", "kiwi", "banana", "apple"]
		
		String str = fruit[2];
		System.out.println(str); // banana
		
		// TODO
		// reassign element under index 3 with value "cherries"
		fruit[3] = "cherries";
		
		//     0        1         2        3
		// ["orange", "kiwi", "banana", "cherries"]
		String arrayAsString = Arrays.toString(fruit);
		System.out.println(arrayAsString); // [orange, kiwi, banana, cherries]
	}
}