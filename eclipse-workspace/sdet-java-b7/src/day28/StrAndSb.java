package day28;

public class StrAndSb {
	public static void main(String[] args) {
		// String -> StringBuilder
		String name = "John Doe";
		// convert String to StringBuilder
		StringBuilder nameSb = new StringBuilder(name);
		nameSb.reverse();
		System.out.println(nameSb);
		
		
		// StringBuilder -> String
		StringBuilder sb = new StringBuilder("java is awesome");
		sb.reverse();
		// convert StringBuilder to String
		String str = sb.toString();
		System.out.println(str);
	}
}