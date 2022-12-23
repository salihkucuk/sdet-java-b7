package day22;

import util.InputFromUser;

public class BreakAndContinue {
	public static void main(String[] args) {
		// break - breaks the loop when used in the body of the loop
		// continue - skips rest of the code after this statetment 
		//            and moves to the next iteration
		
		//       0      3 < 10
		for (int i = 0; i < 10; i++) {
			//  3 == 3
			if (i == 3) {
				break; // break the loop(exit the loop)
			}
			System.out.println(i + " Hello, world!");
		}
		//              0 < 100
		for (int i = 0; i < 100; i++) {
			System.out.println("Day 22 - for loop");
			break;
		}
		
		int count = 0;
		while (count < 10) {
			if (count == 3) {
				break;
			}
			System.out.println(count + " Java");
			count++;
		}
		
		System.out.println("------");
		int myFavoriteNumber = 7;
		for (int i = 0; i < 10; i++) {
			int number = Integer.parseInt(InputFromUser.getInput("Enter number:"));
			
			if (myFavoriteNumber == number) {
				System.out.println("Bingo!");
				// if user got number correctly exit the loop by breaking it
				break; 
			}
		}
		System.out.println("End of program");
	}
}