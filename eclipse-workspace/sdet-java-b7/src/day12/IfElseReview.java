package day12;

import util.InputFromUser;

public class IfElseReview {
	public static void main(String[] args) {
		// comparison operators
		// if else
		// logical operators
		
		int num = Integer.parseInt(InputFromUser.getInput("Enter number:"));
		//    7 == 7 -> true
		if (num == 7) {
			System.out.println("seven");
		} else {
			System.out.println("number: " + num);
		}
		
		// to compare primitives on quality
		// == equal to operator
		// != not equal
		// >, >=
		// <, <=
		
		if (num > 2 && num % 2 == 1) {			
			System.out.println(num + " is greater than two");
			System.out.println("and odd number");
		}
		
		// AND && - all the conditions should true to get true
		// OR  || - at least one condition should be true to get true
		// NOT !  - reverse the value of boolean
	}
}