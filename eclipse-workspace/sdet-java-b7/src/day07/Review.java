package day07;

import util.InputFromUser;

public class Review {
	public static void main(String[] args) {
		// mod/remainder operator - %
		
		int i = 26;
		int j = 5;
		
		//     5 + 5 + 5 + 5 + 5 + 1
		//          26 / 5 = 5 and 1 remains
		//          26 % 5 = 1
		int result = i % j;
		System.out.println("result: " + result); // 1
		
		// How to get input from console?
		String answer = InputFromUser.getInput("What time is it?");
		System.out.println("Time " + answer);
		System.out.println(answer);
	}
}