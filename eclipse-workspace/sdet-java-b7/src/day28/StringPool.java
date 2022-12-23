package day28;

public class StringPool {
	public static void main(String[] args) {
		String str = "java";
		String strTwo = "python";
		String strThree = "java";
		
		System.out.println(str == strTwo); // false
		System.out.println(str == strThree); // true
		
		// It is totally OK to have multiple references 
		// pointing the same String object because
		// the only way to change the string is to create new one
		
		strThree = strThree.toUpperCase();
 	}
}