package day16;

public class StrReplace {
	public static void main(String[] args) {
		// replace(oldValue, newValue)
		// It will replace the old values with new value in the String and return it
		
		String city = "Alma-Ata";
		System.out.println(city);
		
		city = city.replace("-", " ");
		System.out.println(city);
		
		String str = "Updates=are=available";
		// replace will find all old values and replace them with new
		System.out.println(str.replace("=", "$")); // Updates$are$available
		System.out.println(str); // Updates=are=available
		
		str = str.replace("=", " ");
		System.out.println(str);
		
		String strTwo = "Hello, World!";
		System.out.println(strTwo);
		strTwo = strTwo.replace("Hello", "Aloha");
		System.out.println(strTwo);
		
		String strThree = "Good day";
		System.out.println(strThree);
		// if oldValue is not in the string, nothing will happen
		strThree = strThree.replace("night", "morning"); 
		System.out.println(strThree);
	}
}