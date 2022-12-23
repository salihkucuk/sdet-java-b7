package day14;

import java.util.Random;

public class ReviewRandom {
	public static void main(String[] args) {
		Random r = new Random();
		// nextInt(int bound)
		// it returns random number from 0 inclusive till bound exclusive
		
		// nextInt(10); -> 0 - 9
		
		int randomValue = r.nextInt(10);
		System.out.println("random value: " + randomValue);
		
	}
}