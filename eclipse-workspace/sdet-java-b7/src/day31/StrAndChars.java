package day31;

import java.util.Arrays;

public class StrAndChars {
	public static void main(String[] args) {
		// String method toCharArray()
		// It breaks down String into array of char
		
		String str = "hello";
		System.out.println(str);
		
		// ['h', 'e', 'l', 'l', 'o'] <- "hello".toCharArray()
		char[] chars = str.toCharArray();
		System.out.println("chars: " + chars);
		System.out.println(Arrays.toString(chars)); // [h, e, l, l, o]
		System.out.println("---");
		
		String name = "John Doe";
		for (char letter : name.toCharArray()) {
			System.out.println(letter);
		}
		
	}
}