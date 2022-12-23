package day22;

public class StrReverse {
	public static void main(String[] args) {
		isFirstUpperCase("Apple"); // elppa
		
	}
	
	/*
	 * Reverse argument str and return it
	 * 
	 * revStr("apple") -> "elppa"
	 * revStr("hello") -> "olleh"
	 * revStr("abc")   -> "cba"
	 */
	public static boolean isFirstUpperCase(String str) {
    	// if str has as first letter uppec case char return true otherwise false
        // it can any upper case letters
	  
      boolean b=str.isUpperCase(indexOf(0));
      return b;
      
    }
}