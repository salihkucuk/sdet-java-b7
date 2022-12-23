package day50;

/*
 * Runtime exceptions
 * - we are not required to handle them and we get to know about the exception
 *   during the runtime.
 * - All exceptions that extend RuntimeException class are runtime exceptions
 *   
 * Checked exceptions
 * - we must handle or declare checked exceptions
 * - All exceptions that extend Exception (except RuntimeException)
 * 
 * Errors
 * - Errors are system level failures 
 * - We don't handle errors and we don't throw them
 */
public class ExceptionsReview {
	public static void main(String[] args) {
		try {
			String str = "hello world";
			System.out.println(str.substring(0, 20));
			System.out.println("After the substring");
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception is handled");
			System.out.println("Message: " + e.getMessage());
		}
		System.out.println("code is done");
		
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		
		try {
			waitSec(5);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void waitSec(int sec) throws InterruptedException {
		Thread.sleep(1000 * sec);
	}
	
	// we need to declare checked exceptions if our methods throw them
	public static int increaseAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception();
		}
		
		return age + 1;
	}
	
}