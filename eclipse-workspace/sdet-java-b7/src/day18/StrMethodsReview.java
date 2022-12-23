package day18;

public class StrMethodsReview {
	public static void main(String[] args) {
		// length() - returns number of chars in the string.
		
		// toUpperCase() - returns new string in upper cases
		// toLowerCase() - returns new string in lower cases
		String str = "apple";
		str = str.toUpperCase();
		System.out.println(str);
		
		// indexOf(char ch) - returns index position of the char
		// indexOf(String str) - returns index position of the first char in string argument
		//               01234
		String strTwo = "apple";
		System.out.println(strTwo.indexOf('l')); // 3
		System.out.println(strTwo.indexOf("ple")); // 2
		
		// charAt(int index) - returns char based on the index position
		//                 01234567
		String strThree = "john doe";
		char ch = strThree.charAt(7);
		System.out.println(ch);
		
		// substring(int start) and substring(int start, int end)
		// they return portion of the string based on specified indecies
		//            012345678910..
		String box = "java is great";
		String boxPartOne = box.substring(8);
		
		System.out.println(box); // java is great
		System.out.println(boxPartOne); // great
		
		String boxPartTwo = box.substring(0, 4);
		System.out.println(boxPartTwo);
		System.out.println(box); // java is great
			
		// replace(old, new) - it replaces all old values to new value
		String msg = "A, b, c";
		System.out.println(msg); // A, b, c
		msg = msg.replace(",", ".");
		System.out.println(msg); // A. b. c

		// equals(Object obj) and equalsIgnoreCase(Object obj)
		String name = "Kuba";
		String nameTwo = "kuba";
		
		boolean b = name.equals(nameTwo);
		System.out.println(b);
		
		boolean b2 = name.equalsIgnoreCase(nameTwo);
		System.out.println(b2);
		
		// contains(String str) - checks if string contains another string
		String content = "hello, class! today is day 18";
		System.out.println("sss");
		System.out.println(content.contains("t")); // true
		System.out.println(content.contains("o, cla")); // true

		// startsWith(String str) - checks if string starts with another string
		System.out.println(content.startsWith("class")); // false
		System.out.println(content.startsWith("h")); // true
		System.out.println(content.startsWith("hello,")); // true
		System.out.println(content.startsWith("hello ")); // false
		
		// endsWith(String str) - checks if string ends with another string
		System.out.println(content.endsWith("8")); // true
		System.out.println(content.endsWith("day 18")); // true
		System.out.println(content.endsWith("is day")); // false
		
		// this.compareTo(String argument) - can be used to check two strings on alphabetical order
		
		// if this string precedes argument string alphabetically, it returns negative number
		// if this string follows argument string alphabetically, it returns positive number
		// if they are same, it returns 0
		
		String wordOne = "Bek";
		String wordTwo = "Azamat";
		
		if (wordOne.compareTo(wordTwo) < 0) {
			System.out.println("Yes, " + wordOne + " precedes " + wordTwo);
		} else if (wordOne.compareTo(wordTwo) > 0) {
			System.out.println("No, " + wordOne + " follows " + wordTwo );
		} else {
			System.out.println("They are same");
		}
		
	}
}