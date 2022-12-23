package day22;

public class Review {
	public static void main(String[] args) {
		// When do you while loop and when for loop?
		// we use while loop when we don't know the number of iterations in advance
		// we use for loop when we know number of iterations in advance
		
//		while (true) {
//			
//		}
		// for (init part; condition part; action update part) 
		
		//       0      10 < 10; 
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello, class!");
		}
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}
}