package day20;

import util.InputFromUser;

public class MyFavoriteNumber {
	public static final int MY_FAVORITE_NUMBER = 7;
	
	public static void main(String[] args) {
		// 1. Ask user from console to enter your favorite number
		// 2. If user didn't get correctly, keep asking
		// 3. otherwise congratulate and stop the program
		
		String strNumber = InputFromUser.getInput("Enter my favorite number:");
		int favoriteNumber = Integer.parseInt(strNumber);
		
//		if (MY_FAVORITE_NUMBER == favoriteNumber) {
//			System.out.println("Congrats!");
//		} else {
//			System.out.println("Incorrect, try again");
//		}
		
		//           seven not equal to seven -> false
		//                  7 != 7 -> false
		while (favoriteNumber != MY_FAVORITE_NUMBER) {
			System.out.println("Incorrect, try again");
			strNumber = InputFromUser.getInput("Enter my favorite number:");
			favoriteNumber = Integer.parseInt(strNumber);
		}
		
		System.out.println("Congrats!");
	}
}