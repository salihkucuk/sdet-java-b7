package day06;

import util.InputFromUser;

public class InputDemo {
	public static void main(String[] args) {
		String name=InputFromUser.getInput("What's your name?");
		System.out.println("Nice to meet you, " + name + "!");
	}

}
