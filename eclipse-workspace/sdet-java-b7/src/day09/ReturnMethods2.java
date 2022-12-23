package day09;

public class ReturnMethods2 {
	public static void main(String[] args) {
		String str = getName();
		System.out.println(str);
		
	}
	public static String getName() {
		System.out.println("inside getName() method");
		return "John Doe";
	}

}
