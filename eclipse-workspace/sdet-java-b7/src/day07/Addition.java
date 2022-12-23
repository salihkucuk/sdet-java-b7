package day07;

import util.InputFromUser;

public class Addition {
	public static void main(String[] args) {
		String numStrFirst=InputFromUser.getInput("Enter first number:");
		String numStrSecond=InputFromUser.getInput("Enter second number:");
		
		int numFirst=Integer.parseInt(numStrFirst);
		int numSecond=Integer.parseInt(numStrSecond);
		int sum=numFirst+numSecond;
		
		System.out.println(numFirst + " + " + numSecond + " = " + sum);
	}

}
