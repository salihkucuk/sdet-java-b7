package day08;

public class Review {
	public static void main(String[] args) {
		// 1. Type casting
		// 2. Default literal data types
		// 3. Assignment compatibilities
		// 4. String to numeric
		
		// Type casting
		// byte -> short -> int -> long -> float -> double		
		int age = 50;
		long ageLong = age; // auto casting
		
		int amount = 10;
		short shortAmount = (short)amount;
		System.out.println(shortAmount);
		
		double dinnerBill = 50.999;
		long dinnerBillLong = (long)dinnerBill;
		System.out.println(dinnerBillLong);
		
		int number = 400;
		byte numberByte = (byte)number;
		System.out.println(numberByte);
		
		double dNum = 99.99;
		float fNum = (float)dNum;
		System.out.println(fNum);
		System.out.println("------------");
		
		// Default literal data types
		// literal is fixed value that we can directly put in out code
		System.out.println("Hello"); // String
		System.out.println('a'); // char
		System.out.println(true); // boolean
		System.out.println(100); // int
		System.out.println(99.99); // double
		
		long lNum = 10000000000L;
		float floatNumber = 99.9F;
		
		// Assignment compatibilities
		// byte -> short -> int -> long -> float -> double
		int i = 10;
		long i2 = 12;
		short i3 = 5;
		//              int + long + short => long
		System.out.println(i + i2 + i3);
		
		// byte + byte => int
		// byte + short => int
		// short + short => int
		byte b = 10;
		byte b1 = 10;
		byte byteRes = (byte) (b + b1);
		int res = b + b1;
		
		// String to numeric
		String str = "100";
		int number2 = Integer.parseInt(str);
		System.out.println(number2);
		
		String str2 = "99.99";
		double dNumber = Double.parseDouble(str2);
		dNumber = dNumber + 10.0;
		System.out.println(dNumber);
	}
}