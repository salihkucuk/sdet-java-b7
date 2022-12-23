package day18;

public class StrMethodsPractice {
	public static void main(String[] args) {
		System.out.println(firstAndLast("hello")); // ho
		System.out.println(firstAndLast("apple")); // ae
		System.out.println(firstAndLast("Bek")); // Bk
		System.out.println(firstAndLast("HI")); // HI
		System.out.println(firstAndLast("john doe")); // je
		System.out.println("---");
		
		System.out.println(lengthNoSpace("banana")); // 6
		System.out.println(lengthNoSpace("hello world")); // 10
		System.out.println(lengthNoSpace("A b")); // 2
		System.out.println(lengthNoSpace(" a ")); // 1
		System.out.println("---");
		 
		System.out.println(swapFirstAndLast("kiwi")); // iiwk
		System.out.println(swapFirstAndLast("abc")); // cba
		System.out.println(swapFirstAndLast("hello")); // oellh
		System.out.println(swapFirstAndLast("XY")); // YX
	}
	
	/*
	 * return argument str with swapped last and first chars 
	 * str will be at least 2 chars
	 * 
	 * swapFirstAndLast("kiwi")  -> "iiwk"
	 * swapFirstAndLast("abc")   -> "cba"
	 * swapFirstAndLast("hello") -> "oellh"
	 * swapFirstAndLast("XY")    -> "YX"
	 * 
	 * 1. get first letter store somewhere (charAt or substring)
     * 2. get last letter store somewhere (charAt or substring)
     * 3. get middle string without first and last (substring)
     * 4. return by joining them together in different order
	 */
	public static String swapFirstAndLast(String str) {
		String firstChar = str.substring(0, 1);
		String lastChar = str.substring(str.length() - 1);
		String midStr = str.substring(1, str.length() - 1);
		return lastChar + midStr + firstChar;
	}
	
	public static String swapFirstAndLastTwo(String str) {
		char firstCh = str.charAt(0);
		char lastCh = str.charAt(str.length() - 1);
		String midStr = str.substring(1, str.length() - 1);
		return lastCh + midStr + firstCh;
	}
	
	/*
	 * return length of str but ignore the white spaces
	 * lengthNoSpace("banana")      -> 6
	 * lengthNoSpace("hello world") -> 10
	 * lengthNoSpace("A b")         -> 2
	 * lengthNoSpace(" a ")         -> 1
	 * 
	 * replace(old, new)
	 * length()
	 */
	public static int lengthNoSpace(String str) {
		// remove white spaces
		str = str.replace(" ", "");
		
		// get length
		return str.length();
	}
	
	/*
	 * return first and last letter of str
	 * assume the length of the input str is going to be 2 or more
	 * 
	 * firstAndLast("hello")    -> ho
	 * firstAndLast("apple")    -> ae
	 * firstAndLast("Bek")      -> Bk
	 * firstAndLast("HI")       -> HI
	 * firstAndLast("john doe") -> je
	 */
	public static String firstAndLast(String str) {		
		char fCh = str.charAt(0);
		char lCh = str.charAt(str.length() - 1);
		String res = String.valueOf(fCh) + String.valueOf(lCh);
		return res;
	}	
}