package day07;

import util.InputFromUser;

public class DiffWayOfConsoleInput {
	public static void main(String[] args) {
		String name = InputFromUser.getInput("What's your name?");
		System.out.println(name);
		
		String ageStr = InputFromUser.getInput("What's your age?");
		int age = Integer.parseInt(ageStr);
		System.out.println(age);
	}
}