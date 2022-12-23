package day23;

public class StrReversePractice {
	public static void main(String[] args) {
		System.out.println(revStr("apple")); // elppa
		System.out.println(revStr("abc")); // cba
		System.out.println(revStr("hello world")); // dlrow olleh
	}
	
	/*
	 * return reverse version of str
	 * revStr("apple")         -> elppa
	 * revStr("abc")           -> cba
	 * revStr("hello world")   -> dlrow olleh
	 * 
	 * 1. Create empty string variable
	 * 2. Loop over str from the back
	 * 3. Keep adding each char to new variable
	 * 4. return it
	 */
	public static String revStr(String str) {
		
		String res = "";

		for (int i =str.length()-1; i >=0; i--) {
		   res = res + str.charAt(i);
		 }
		  return res;
	}
}