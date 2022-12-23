package day12;

public class ReviewMethodOverloading {
	public static void main(String[] args) {
		// When we have multiple methods with same name
		// but different arguments:
		// different data type of arguments
		// different number of arguments
		
		printInfo("day 12 - sun - kahoot");
		printInfo(99);
		printInfo("day 12", 99);
		printInfo(99, "day 12");
	}
	
	public static void printInfo(String str) {
		System.out.println("Info: " + str);
	}
	
	public static void printInfo(int num) {
		System.out.println("Info: " + num);
	}
	
	public static void printInfo(String str, int num) {
		System.out.println("Info: " + str + ", " + num);
	}
	
	public static void printInfo(int num, String str) {
		System.out.println("Info: " + str + ", " + num);
	}
}