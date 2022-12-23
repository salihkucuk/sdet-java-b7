package day09;

public class Review {
	public static void main(String[] args) {
		// Spec assignment operators
		int age = 20;
		System.out.println(age); // 20

		age = age + 10;
		System.out.println(age); // 30
		
		age += 10;
		System.out.println(age); // 40
		
		age -= 5;
		System.out.println(age); // 35
		
		//                 35 - 10 = 25
		System.out.println(age - 10); // 25
		System.out.println(age); // 35
	}
}
