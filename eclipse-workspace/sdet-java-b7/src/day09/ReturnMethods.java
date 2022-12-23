package day09;

public class ReturnMethods {
	public static void main(String[] args) {
		sayHello();
		
		String result = getHello();
		System.out.println(result); // hello
		
		System.out.println(getApple()); // apple
		
		int number = getNumber();
		System.out.println(number);
	}
	
	public static void sayHello() {
		System.out.println("Hello!");
	}
	
	public static String getHello() {
		System.out.println("inside getHello()");
		
		String str = "hello";
		return str;
	}
	
	public static String getApple() {
		// the return method must return specified value otherwise it will not compile
		return "apple";
	}
	
	public static int getNumber() {
		// if we define specific type as a return type for our method
		// we must return that type
		int num = 123;
		return num;
	}
	
}