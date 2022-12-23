package day20;

public class InfiniteLoop {
	public static void main(String[] args) {
		/*
		 * it keeps executing the body while boolean condition is true
		 * after each iteration, it checks boolean condition
		 * 
		 * while(boolean condition) {
		 * 	   // body of the loop
		 * }
		 */	
		boolean b = true;
		while (b) {
			System.out.println("Java");
		}
		
	}
}