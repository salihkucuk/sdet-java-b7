package day17;

public class StrCompareTo {
	public static void main(String[] args) {
		/*
		 * compareTo(String str) compares two strings on the alphabetical order
		 * - the result is negative integer if this string alphabetically 
		 *   precedes the argument string.
		 * - the result is positive integer if this string alphabetically
		 *   follows the argument string.
		 * - the result is zero if the strings are equal.  
		 */
		
		String name = "Alex";
		String nameTwo = "Azamat";
		
		System.out.println(name.compareTo(nameTwo)); // -14
		if (name.compareTo(nameTwo) < 0) {
			System.out.println(name + " precedes " + nameTwo + " in alphabetical order");
		} else {
			System.out.println(name + " follows " + nameTwo + " in alphabetical order");
		}
		
		String str = "Abc";
		String strTwo = "Abc";
		System.out.println(str.compareTo(strTwo)); // 0
	}
}