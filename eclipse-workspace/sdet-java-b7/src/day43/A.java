package day43;

public class A {
	public String str = "A";
	public int number = 1;
	
	public void hello() {
		System.out.println("Hello from class A!");
	}
	
	public String javaIsFun() {
		return "Java is fun from class A";
	}
	
	public int sum(int num, int num2) {
		System.out.println("sum in class A");
		return (num + num2) * 2;
	}
	
	public static void sayHello() {
		System.out.println("Hello from static method!");
	}
}