package day08;

public class IncAndDecOperators {
	public static void main(String[] args) {
		int number = 5;
		System.out.println("Example 1: " + number);
		
		// increase value of number by 1
		number = number + 1;
		// number += 1;
		System.out.println("Example 2: " + number);
		
		// Increment operator will increase value of variable by one
		number++;
		System.out.println("Example 3: " + number);
		
		// Decrement operator will decrease value of variable by one
		number--;
		System.out.println("Example 4: " + number);
		
		int num = 10;
		// post increment
		num++;
		System.out.println("Example 5: " + num);
		// pre increment
		++num;
		System.out.println("Example 6: " + num);
		
		// post decrement
		num--;
		
		// pre decrement
		--num;
		System.out.println("----------");
		
		int value = 20;
		// post increment/decrement will get applied when next time we use the variable
		System.out.println(value++);
		System.out.println(value); // 21
		
		// pre increment/decrement will get applied right away. 
		System.out.println(++value); // 22
		System.out.println(value); // 22
	}
}