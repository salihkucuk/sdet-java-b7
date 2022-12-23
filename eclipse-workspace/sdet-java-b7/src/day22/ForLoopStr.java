package day22;

public class ForLoopStr {
	public static void main(String[] args) {
		String str = "wooden spoon and java";		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("--------");
		//               01234
		String strTwo = "hello";	
		for (int i = strTwo.length() - 1; i >= 0; i--) {
			System.out.println(strTwo.charAt(i));
		}
	}
}