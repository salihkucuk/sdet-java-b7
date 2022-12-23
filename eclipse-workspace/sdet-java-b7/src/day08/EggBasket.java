package day08;

import util.InputFromUser;

public class EggBasket {
	
	public static void main(String[] args) {				
		String numStrOfBaskets=InputFromUser.getInput("Enter number of baskets:");
		String eggsStrPerBasket=InputFromUser.getInput("Enter eggs per basket:");				
		
		int numberOfBaskets=Integer.parseInt(numStrOfBaskets);
		int eggsPerBasket=Integer.parseInt(eggsStrPerBasket);
		int totalEggs=numberOfBaskets*eggsPerBasket;		
		
		System.out.println(numberOfBaskets + " * " + eggsPerBasket + " = " + totalEggs);
		
		System.out.println("if you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("The total number of eggs is " + totalEggs);
	}
}
