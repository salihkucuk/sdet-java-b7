package day17;

import util.InputFromUser;

public class Password {
	public static void main(String[] args) {
		// Program should accept from the console the new password to set.
		// - new password should be equal or more than 5 chars
		// - new password should contain at least one special char (!, $, %)
		// - new password should contain at least one numeric value
		
		String newPassword = InputFromUser.getInput("Enter your new password:");
		System.out.println(newPassword);
		
		if (newPassword.length() < 5) {
			System.out.println("Rejected, it should have at least 5 chars");

		} else if (!(newPassword.contains("!") || newPassword.contains("$") || newPassword.contains("%"))) {
			System.out.println("Rejected, it should have one of these (!,$,%) special chars");
		} else if (!hasNumeric(newPassword)) {
			System.out.println("Rejected, it should have at least one numeric value");
		} else {
			System.out.println("New password is accepted!");
		}
	}
	
	public static boolean hasNumeric(String str) {
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		
		return false;
	}
	
}