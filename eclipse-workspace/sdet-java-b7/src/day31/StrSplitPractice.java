package day31;

public class StrSplitPractice {
	public static void main(String[] args) {
		System.out.println(countWords("my name is john doe")); // 5
		System.out.println(countWords("hello world")); // 2
		System.out.println(countWords("java is great")); // 3
	}
	
	/*
	 * return number of words in the str
	 * countWords("my name is john doe");   -> 5
	 * countWords("hello world");           -> 2
	 * countWords("java is great");         -> 3
	 */
	public static int countWords(String str) {
	
		String[] words = str.split(" ");
		return words.length;
		
	}
}