package day48;

import util.InputFromUser;

public class EvenOdd {
	public static void main(String[] args) {
		// Ask numeric input from user and print even or odd based on the value
		// - print, the message and ask user again
		int num;
		do {
			String strNum = "";
			try {
				strNum = InputFromUser.getInput("Enter any number: ");
				num = Integer.parseInt(strNum);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid number: " + strNum);
			}
		} while (true);
		
		
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
			
	}
}