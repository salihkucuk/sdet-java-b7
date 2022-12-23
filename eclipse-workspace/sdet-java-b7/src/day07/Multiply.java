package day07;

import util.InputFromUser;

public class Multiply {
	public static void main(String[] args) {
		String numStrFirst=InputFromUser.getInput("Enter first number:");
		String numStrSecond=InputFromUser.getInput("Enter second number:");
		
		int numFirst=Integer.parseInt(numStrFirst);
		int numSecond=Integer.parseInt(numStrSecond);
		int result=numFirst * numSecond;
		
		System.out.println(numFirst + " * " + numSecond + " = " + result);
	}

}

