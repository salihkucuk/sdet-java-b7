package day16;

public class StrCharAtPractice {
	public static void main(String[] args) {
		 printLastChar("hello"); // o
		 printLastChar("apple"); // e
		 printLastChar("Alex"); // x
		 printLastChar("Bek"); // k
		 printLastChar("A"); // A
	}
	
	/*
	 * Print last char of argument str by using charAt(int index) method
	 * printLastChar("hello"); o
	 * printLastChar("apple"); e
	 * printLastChar("Alex"); x
	 * printLastChar("Bek"); k
	 * printLastChar("A"); A
	 * 
	 */
	public static void printLastChar(String str) {
		char last = str.charAt(str.length() -1);

		System.out.println(last);
	}
}