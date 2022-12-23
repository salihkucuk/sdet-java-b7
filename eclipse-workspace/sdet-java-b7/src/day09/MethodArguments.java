package day09;

public class MethodArguments {
	public static void main(String[] args) {
		sayHello("Bek");
		sayHello("John");
	}
	public static String sayHello(String Hello) {
		System.out.println("Hello"+ " "+ Hello);
		return Hello;
	}

}
