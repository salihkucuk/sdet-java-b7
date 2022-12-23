package day15;

public class SwitchReview {
	public static void main(String[] args) {
		String item = "abc";
		
		// Data types supported by switch:
		// byte and Byte
		// short and Short
		// int and Integer
		// char and Character
		// String 
		// Enum
		
		//     "abc"
		switch (item) {
		case "apple": 
			System.out.println(2.5);
			break;
		case "banana":
			System.out.println(1.2);
			break;
		case "abc":	
			System.out.println(0.7);
			break;
		default:
			System.out.println("we don't have item - " + item);
		}
		
		int value = 100;
		// if value is within 10 - 20, print small numbers
		// if value is within 21 - 30, print regular numbers
		// if value is within 50 - 100, print big numbers
		
		if (value >= 10 && value <= 20) {
			System.out.println("small numbers");
		} else if (value >= 21 && value <= 30) {
			System.out.println("regular numbers");
		} else if (value >= 50 && value <= 100) {
			System.out.println("big numbers");	
		}
	}
}
