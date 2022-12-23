package day48;

import util.InputFromUser;

public class ExceptionTaskTwo {
	public static void main(String[] args) {
		String strNum = InputFromUser.getInput("Enter numbers within 1-5:");
		int number;
		
		try {
			number = Integer.parseInt(strNum);
		} catch(NumberFormatException e) {
			System.out.println("1-5 numbers only");
			return;
		}
			
		switch(number) {
		case 1: 
			System.out.println("One");
			break;
		case 2: 
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;	
		default:
			System.out.println("1-5 numbers only");
		}
		// TODO when user enters non-numeric value print
		// "1-5 numbers only"
	}
}