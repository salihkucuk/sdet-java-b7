package day11;

public class Review {
	public static void main(String[] args) {
		// == equal to
		      // - compares primitives on equality
		      // - for objects it will check if two references pointing to the same
		      //   object or not.
		// != not equal
		// > and >=
		// < and <=
		
		// when we compare values with comp operators we will get boolean
		char ch = 'a';
		char ch1 = 'a';
		
		boolean b = ch == ch1;
		System.out.println(b);
		
		if (true) {
			System.out.println("Java day 11");
		}
		
		int num = 5;
		int numTwo = 6;
		//    5 > 6 -> false
		if (num > numTwo) {
			System.out.println("Java"); 
		} else {
			System.out.println("Python"); 
		}
		
		System.out.println("Review is done");
	}
}