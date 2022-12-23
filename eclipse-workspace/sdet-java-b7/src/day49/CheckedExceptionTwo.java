package day49;

public class CheckedExceptionTwo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			wait(1);
		}
	}
	
	// Exception declaration is always in method level
	// this method potentially throws InterruptedException exception
	public static void wait(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}
}