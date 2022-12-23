package day23;

import util.InputFromUser;

public class Pyramid {
	/*
	 * Ask from user number as input and print pyramid based on this number
	 * 
	 * Enter number:
	 * 3
	 * #
	 * ##
	 * ###
	 * 
	 * Enter number: 
	 * 5
	 * #
	 * ##
	 * ###
	 * ####
	 * #####
	 */
	
	public static void main(String[] args) {
		String inputStr = InputFromUser.getInput("Enter number:");
		int pyramidLevel = Integer.parseInt(inputStr);
		
		String hash = "#";
		String pyramidDisplay = hash;
		
		for (int i = 0; i < pyramidLevel; i++) {
			System.out.println(pyramidDisplay);
			pyramidDisplay = pyramidDisplay + hash;
		}
	}
}