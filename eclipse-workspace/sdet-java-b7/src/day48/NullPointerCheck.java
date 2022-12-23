package day48;

public class NullPointerCheck {
	public static final String EXPECTED_PASSWORD = "ABC123!";
	
	public static void main(String[] args) {
		printInUpperCase("apple"); // APPLE
		printInUpperCase(null); // Invalid str
		printInUpperCase(""); // Invalid str
		System.out.println("---");
		
		//        null
		String actualPassword = getPassword();
		if (EXPECTED_PASSWORD.equals(actualPassword)) {
			System.out.println("Welcome");
		} else {
			System.out.println("Rejected");
		}
		// BREAK TILL 10:11AM EST
	}
	
	public static String getPassword() {
		// code that gets password from another system or user
		return null;
	}
	
	/*
	 * Print str in upper case
	 * if str is empty or null print "Invalid str"
	 */
	public static void printInUpperCase(String str) {
		//       T      OR  
		if (str == null || str.isEmpty()) {
			System.out.println("Invalid str");
			return; // exit from the method
		}
		
		
		System.out.println(str.toUpperCase());
	}
}