package day49;

import util.InputFromUser;

public class HandleGeneralExceptions {
	public static void main(String[] args) {
		String firstNumberStr = InputFromUser.getInput("Enter first number:");
		String secondNumberStr = InputFromUser.getInput("Enter second number:");
		try {
			int firstNumber = Integer.parseInt(firstNumberStr);
			System.out.println(firstNumber);
			
			int secondNumber = Integer.parseInt(secondNumberStr);
			System.out.println(secondNumber);
			
			int result = firstNumber / secondNumber;
			System.out.println(firstNumber + " / " + secondNumber + " = " + result);
		
		// catching general RuntimeException, it will catch all runtime exceptions
		} catch(RuntimeException e) {
			System.out.println(e.getClass());
			System.out.println("Exception is hanlded: " + e.getMessage());
		}
		
		// java.lang.NumberFormatException
		// Exception is a special class that we can throw or handle
	}
}