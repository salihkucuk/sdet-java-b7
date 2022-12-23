package day49;

import java.util.Random;

public class HandleGeneralExceptionsTwo {
	public static void main(String[] args) {
		try {
			method();
			
			// the smaller(based on inheritance) exception should be first
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception is handled");
			
		} catch (RuntimeException e) {
			System.out.println(e.getClass());
			System.out.println("Exception is handled");
		} 
		
	}
	
	public static void method() {
		int r = new Random().nextInt(101);
		if (r % 2 == 0) {
			throw new NullPointerException("test null pointer");
		} else {
			throw new IndexOutOfBoundsException("test out of bound");
		}
	}
}