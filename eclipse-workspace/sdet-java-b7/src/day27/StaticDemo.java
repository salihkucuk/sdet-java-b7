package day27;

public class StaticDemo {
	public static void main(String[] args) {
		// We don't have to create an object to use static
		// variables and methods. We use them by class name
		
		StringUtil.printEachChar("apple");
		System.out.println("--");
		
		String res = StringUtil.upperLower("hello");
		System.out.println(res);
		
		
		StringUtil.str = "Java day 27";
		System.out.println(StringUtil.str);
	}
}