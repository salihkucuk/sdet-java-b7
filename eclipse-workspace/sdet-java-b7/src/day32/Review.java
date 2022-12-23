package day32;

import java.util.Arrays;

public class Review {
	public static void main(String[] args) {
		// toCharArray()
		String str = "wooden spoon";
		// [w,o,o,d,e,n, ,s,p,o,o,n]
		char[] arrCh = str.toCharArray();
     
		for (char ch : arrCh) {
			System.out.println(ch);
		}
		System.out.println("---");
		
		String strTwo = "apple";
		for (char letter : strTwo.toCharArray()) {
			System.out.println(letter);
		}
		System.out.println("---");
		
		// split(String pattern)
		
		String names = "Alex, Bek, Kuba, John";
		String[] arrNames = names.split(", ");
		
		for (String name : arrNames) {
			System.out.println(name);
		}
		System.out.println("---");
		System.out.println(Arrays.toString(arrNames));
		
		String name = "John Doe";
		String[] arrStr = name.split(", ");
		System.out.println("Size: " + arrStr.length);
		System.out.println(Arrays.toString(arrStr)); // [John Doe]
	}
}