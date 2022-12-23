package day19;

public class DisplayScore {
	enum Grade{
		A,
		B,
		C,
		F
		
	}
	public static void main(String[] args) {
		// TODO refactor this program to use Enum
		// 1. Create local enum inside this class with list of values (A, B, C, F)
		// 2. Change method argument to use our enum
		// 3. Change logic of the program
		// 4. Use your method in the main method
		displayScore(Grade.A); 
		displayScore(Grade.B); 
		displayScore(Grade.C); 
		displayScore(Grade.F); 
	}
	
	/*
	 * if grade is A then print - "90 - 100"
	 * if grade is B then print - "65 - 89"
	 * if grade is C then print - "50 - 64"
	 * if grade is F then print - "less than 49"
	 */
	public static void displayScore(Grade grade) {
		if (grade == (Grade.A)) {
			System.out.println("90 - 100");
		} else if (grade == (Grade.B)) {
			System.out.println("65 - 89");
		} else if (grade == (Grade.C)) {
			System.out.println("50 - 64");
		} else if (grade == (Grade.F)) {
			System.out.println("less than 49");
		} else {
			System.out.println("Undefined grade: " + grade);
		}
	}
}