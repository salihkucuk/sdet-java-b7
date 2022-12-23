package day49;

import java.util.Random;

public class ExceptionTask {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println("Size: " + str.length());
			
			int i = 2, iTwo = 0;
			int res = i / iTwo;
			System.out.println("res: " + res);
			
			int rNumber = new Random().nextInt(101);
			if (rNumber > 50) {
				throw new IllegalArgumentException("too big");
			}
			
		} catch (RuntimeException e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		System.out.println("Program is done");
		
		// TODO handle all exception using:
		// - one catch with one exception type
	}
}