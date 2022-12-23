package day21;

import util.InputFromUser;

public class LogIn {
	public static final String PASSWORD = "qwerty1$";
	public static final int ATTEMPTS = 3;
	
	public static void main(String[] args) {		
		String enteredPassword = InputFromUser.getInput("Enter password:");
		int numberOfAttempts = 1;

		while (!PASSWORD.equals(enteredPassword) && numberOfAttempts < ATTEMPTS) {
			enteredPassword = InputFromUser.getInput("Enter password:");
			numberOfAttempts++;
		}
		
		if (numberOfAttempts == ATTEMPTS && !PASSWORD.equals(enteredPassword)) {
			System.out.println("Your account is blocked.");
		} else {
			System.out.println("Welcome to your dashboard!");
		}
		
		// BREAK TILL 8:23PM EST
	}
}