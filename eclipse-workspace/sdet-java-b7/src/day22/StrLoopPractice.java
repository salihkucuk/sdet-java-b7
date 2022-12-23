package day22;

public class StrLoopPractice {
	public static void main(String[] args) {
		System.out.println(getNumberOfVowels("apple")); // 2
		System.out.println(getNumberOfVowels("Java")); // 2
		System.out.println(getNumberOfVowels("hello world")); // 3
		System.out.println(getNumberOfVowels("abc")); // 1
	}
	
	/*
	 * Return number of vowel letter in argument str
	 * Vowel letters: a, e, i, o, u
	 *                A, E, I, O, U
	 * 
	 * getNumberOfVowels("apple") -> 2
	 * getNumberOfVowels("Java")  -> 2
	 * getNumberOfVowels("hello world") -> 3
	 * getNumberOfVowels("abc") -> 1
	 */
	public static int getNumberOfVowels(String str) {
		int numberOfVowels = 0;
		str = str.toLowerCase();
            
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); 
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				numberOfVowels++;
			}
		}
		return numberOfVowels;
	}
	
}