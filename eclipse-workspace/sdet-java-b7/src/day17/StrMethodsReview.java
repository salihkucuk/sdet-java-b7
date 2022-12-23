package day17;

public class StrMethodsReview {
	public static void main(String[] args) {
		// length() - returns amount of characters in the string
		String str = "hello world!";
		int l = str.length();
		System.out.println("Number of characters: " + l);
		
		// toUpperCase() converts content to upper case return it as new string
		str = str.toUpperCase();
		System.out.println(str); 
		
		// toLowerCase()
		str = str.toLowerCase();
		System.out.println(str);
		
		// indexOf(char ch), indexOf(String str)
		//       01234
		int i = "apple".indexOf('l');
		// because index of 'l' in the string is 3
		System.out.println(i); // 3
		
		//     01234...
		str = "java is awesome";
		System.out.println(str.indexOf("va")); // 2
		
		// charAt(int index)
		char ch = str.charAt(0);
		System.out.println(ch); // j
		
		// replace(oldValue, newValue) it replaces old value with new
		
		str = str.replace("awesome", "great");
		System.out.println(str);
		
		String msg = "a b c d";
		System.out.println(msg);
		msg = msg.replace(" ", "");
		System.out.println(msg); // abcd
	}
}