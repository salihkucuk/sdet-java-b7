package day27;

// static variables and methods are global and belong to class, 
// not to specific object
public class StringUtil {
	public static String str;
	
	public static void printEachChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static String upperLower(String str) {
		if (str.length() % 2 == 0) {
			return str.toUpperCase();
		}
		return str.toLowerCase();
	}
}	