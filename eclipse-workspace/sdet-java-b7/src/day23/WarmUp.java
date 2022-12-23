package day23;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(countLetter("Frederick", 'e')); // 2
		System.out.println(countLetter("abc", 'b')); // 1
		System.out.println(countLetter("aaabbbcccbb", 'b')); // 5
		System.out.println(countLetter("hello", 'h')); // 1
	}
	
	/*
	 * return number of letter in str
	 * countLetter("Frederick", 'e')   -> 2
	 * countLetter("abc", 'b')         -> 1
	 * countLetter("aaabbbcccbb", 'b') -> 5
	 * countLetter("hello", 'h')       -> 1
	 */
	public static int countLetter(String str, char letter) {
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
		char ch=str.charAt(i);
		if(ch==letter) {
			count++;
		}

		}
		return count;
	}
}