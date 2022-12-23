package day29;

import java.util.Arrays;

public class FirstLast {
	public static void main(String[] args) {
		String[] team = new String[4];
		team[0] = "Javengers";
		team[1] = "Dream coders";
		team[2] = "Bug busters";
		team[3] = "10X team";
		System.out.println(Arrays.toString(team));
		
		String[] teamTwo = new String[] {"A", "B", "C", "D"};
		System.out.println(Arrays.toString(teamTwo));
		
		String[] teamThree = {"Team One", "Team Two", "Team Three"};
		System.out.println(Arrays.toString(teamThree));
		
		// TODO array of double numbers with these values [10.5, 12.1, 11.9, 7.7, 0.5]
		double[] number = {10.5, 12.1, 11.9, 7.7, 0.5};
		System.out.println(Arrays.toString(number));
		
		int arraySize = number.length;
		System.out.println("Array size: " + arraySize);
		
		// TODO get sum of first and last elements of number array
		double firstLastSum = number[0] + number[number.length - 1];
		System.out.println("Sum of first and last elements: " + firstLastSum);
	}
}