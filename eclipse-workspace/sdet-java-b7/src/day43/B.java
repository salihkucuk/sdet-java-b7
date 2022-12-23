package day43;

public class B extends A {
	// we hide variables of parent class if declare the same 
	// variables in the child class
	public String str = "B";
	public int number = 2;
	
	@Override
	public void hello() {
		System.out.println(str);
		System.out.println(super.str);
		
		System.out.println("Hello from class B!");
	}
	
	@Override
	public String javaIsFun() {
		return "Java is super fun from class B";
	}
	
	@Override
	public int sum(int num, int num2) {
		System.out.println("sum in class B");
		return num + num2;
	}
	
	// we cannot override static methods
//	@Override
//	public static void sayHello() {
//		
//	}

}