package day28;

public class PassByReference {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello world");
		changeSb(sb);
		System.out.println(sb);
		
		String str = "hello world";
		changeStr(str);
		System.out.println(str);
	}
	
	public static void changeSb(StringBuilder sbInput) {
		sbInput.append("Hello, class");
	}
	
	public static void changeStr(String strInput) {
		strInput += "Hello, class";
	}
}