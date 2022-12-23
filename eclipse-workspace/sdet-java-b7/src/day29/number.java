package day29;

import java.util.Arrays;

public class number {
	public static void main(String[] args) {
		
	
	String[] team = new String[4];
	
	
	team[0] = "John";
	team[1] = "Jonathan";
	team[2] = "Jack";
	team[3] = "Jason";
	
	System.out.println(team[0]);
	System.out.println(team[1]);
	System.out.println(team[2]);
	System.out.println(team[3]);
	String arrayAsString = Arrays.toString(team);
	System.out.println(arrayAsString);
}
}