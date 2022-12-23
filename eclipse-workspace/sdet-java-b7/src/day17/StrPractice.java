package day17;

public class StrPractice {
	public static void main(String[] args) {
		System.out.println(isEevenLegth("java")); // true
		System.out.println(isEevenLegth("apple")); // false
		System.out.println(isEevenLegth("abc")); // false
		System.out.println("------");
		
		System.out.println(isUpperCase("JAVA")); // true
		System.out.println(isUpperCase("Java")); // false
		System.out.println(isUpperCase("ABC")); // true
		System.out.println(isUpperCase("Apple")); // false
		System.out.println(isUpperCase("abc")); // false
	}
	
	/*
	 * return true if str argument is in all upper cases, otherwise return false
	 * isUpperCase("JAVA") -> true
	 * isUpperCase("Java") -> false
	 * isUpperCase("ABC")  -> true
	 * isUpperCase("Apple") -> false
	 * isUpperCase("abc") -> false
	 */
	public static boolean isUpperCase(String str) {
		return str.equals(str.toUpperCase());
		
	}
	
	/*
	 * return true if str argument length is even, otherwise return false
	 * isEevenLegth("java");  -> true
	 * isEevenLegth("apple"); -> false
	 * isEevenLegth("abc");   -> false
	 */
	public static boolean isEevenLegth(String str) {		
		return str.length() % 2 == 0;
	}
}