package day21;

public class MyNumbers {
	public static void main(String[] args) {
		print100(); // 1 ... 100
		printReverse100(); // 100 ... 1
		
		printTill(5); // 0 1 2 3 4 5
		printTill(3); // 0 1 2 3
		printTill(0); // 0
		printTill(2); // 0 1 2
		printTill(7); // 0 1 2 3 4 5 6 7
		
		System.out.println(totalSum(5)); // 15
		System.out.println(totalSum(3)); // 6
		System.out.println(totalSum(6)); // 21
		System.out.println(totalSum(1)); // 1
	}
	
	/*
	 * return total sum from 1 till number argument
	 * totalSum(5) -> 15 (1 + 2 + 3 + 4 + 5)
	 * totalSum(3) -> 6 (1 + 2 + 3)
	 * totalSum(6) -> 21
	 * totalSum(1) -> 1
	 */
	public static int totalSum(int number) {
		// TODO
		int sum=0;
		for(int i=1; i<=number; i++) {
			sum +=i;
		}
		return sum;
	}
	
	/*
	 * print numbers from 0 till number inclusive
	 * printTill(5) -> 0 1 2 3 4 5
	 * printTill(3) -> 0 1 2 3
	 * printTill(2) -> 0 1 2
	 * printTill(7) -> 0 1 2 3 4 5 6 7
	 */
	public static void printTill(int number) {
		for (int i = 0; i <= number; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	/*
	 * print numbers from 1 to 100 inclusive
	 */
	public static void print100() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	/*
	 * print numbers from 100 to 1 inclusive
	 */
	public static void printReverse100() {
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}