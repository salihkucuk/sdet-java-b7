package day24;

public class NumberPlindrome {
	public static void main(String[] args) {
		System.out.println(isNumPalTwo(545)); // true
		System.out.println(isNumPalTwo(1001)); // true
		System.out.println(isNumPalTwo(13)); // false
		System.out.println(isNumPalTwo(33)); // true 
		System.out.println(isNumPalTwo(7777777)); // true 
		System.out.println(isNumPalTwo(666612)); // false
		System.out.println(isNumPalTwo(1000000001)); // true
		System.out.println(isNumPalTwo(1000300201)); // false 
		System.out.println("------");
		
	}
	
	/*
	 * 
	 */
	public static boolean isNumPalTwo(int num) {
		// % and /
		// to get most right number, we can do num % 10
		// to remove most right number, we can do num / 10
		// to add (not plus) 3 2 -> 32, 3 * 10 + 2 -> 32
		
		int original = num; // take a copy of num
		int rev = 0;
		int mostRight;
		
		while (num > 0) {
			mostRight = num % 10; // get right most
			num = num / 10; // remove right most
			rev = rev * 10 + mostRight; // add right most to rev variable
		}
		
		return original == rev; // compare original with reverse
	}
	
	/*
	 * isNumPal(545)  -> true
	 * isNumPal(1001) -> true
	 * isNumPal(13)   -> false
	 * isNumPal(33)   -> true
	 */
	public static boolean isNumPal(int num) {
		String strNum = String.valueOf(num);
		String rev = "";
		for (int i = strNum.length() - 1; i >= 0; i--) {
			rev += strNum.charAt(i);
		}
		
		return strNum.equals(rev);
	}
	
}