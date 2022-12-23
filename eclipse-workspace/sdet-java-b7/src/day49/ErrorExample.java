package day49;

public class ErrorExample {
	public static void main(String[] args) {
		myMethod(9999999, 99999.99999);
	}
	
	public static void myMethod(long lNum, double dNumArg) {
		System.out.println("in the method");
		myMethod(lNum, dNumArg);
	}
}