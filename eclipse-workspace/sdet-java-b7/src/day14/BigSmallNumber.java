package day14;

import java.util.Random;

public class BigSmallNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int value = r.nextInt(101); // 0 - 100
		String msg = "";
		
		// TODO if value is greater than 50, assign as "big number"
		//      otherwise assign as "small number"
		//      We need to use ternary operator
		
		msg=value>50 ?"big number":"small number";
		System.out.println("value: " + value);
		System.out.println("message: " + msg);
	}
}