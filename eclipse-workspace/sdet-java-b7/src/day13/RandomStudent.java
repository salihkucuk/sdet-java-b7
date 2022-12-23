package day13;

import java.util.Random;

// java.lang package is always auto imported that's why we don't have to import String, Math
// and all other classes under this package
public class RandomStudent {
	public static final int NUMBER_OF_STUDENT = 5;

	public static void main(String[] args) {
		Random r = new Random();
		
		// 0-4
		int randomNumber = r.nextInt(NUMBER_OF_STUDENT);
	
		if (randomNumber == 0) {
			System.out.println("Paul");
		} else if (randomNumber == 1) {
			System.out.println("Thanyarat");
		} else if (randomNumber == 2) {
			System.out.println("Majid");
		} else if (randomNumber == 3) {
			System.out.println("Panithan");
		} else if (randomNumber == 4) {
			System.out.println("Krisana");
		}
		
		// Generate numbers in this range: 10 - 20
		//             2 + 10 = 12
 		//         (0 - 10) + 10 
		int rNum = r.nextInt(11) + 10;
		System.out.println(rNum);
	}
}