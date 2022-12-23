package day49;

public class CheckedException {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				// this code potentially throws checked exception
				// we need to handle it to make it compile
				Thread.sleep(1000);
				
			} catch(InterruptedException e) {
				System.out.println("Exception is handled: " + e.getMessage());
			}
			
		}
	}
}