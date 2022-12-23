package day48;

public class HandleExceptions {
	public static void main(String[] args) {
		String str = null;
		int length;
		
		try {
			length = str.length();
			System.out.println("Length of str(line 10): " + length);
			// java.lang.NullPointerException
			
		} catch(NullPointerException e) {
			System.out.println("str was null so considering length as 0");
			length = 0;
			System.out.println("Length of str(line 16): " + length);
		}
		
		System.out.println("Line 7");
		System.out.println(length);
	}
}