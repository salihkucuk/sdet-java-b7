package day18;

public class StrMoreMethods {
	public static void main(String[] args) {
		// trim() - removes white spaces around the String value
		String name = " John Doe  ";
		System.out.println(name);
		System.out.println(name.length());
		name = name.trim();
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println("---");
		
		// isEmpty() - checks if string is empty
		String str = "";
		System.out.println(str.isEmpty()); // true
		System.out.println(str.length() == 0); // true
		System.out.println("---");
		
		// String.valueOf(dataType) - converts argument type to String
		int number = 5;
		//        "5"
		String strNumber = String.valueOf(number);
		System.out.println(strNumber); // 5;
		System.out.println("---");
		
		// String.join(String delimiter, values...) joins values in one string with delimiter
		String names = String.join(" | ", "Alex", "Kuba", "Bek", "Ramesh");
		System.out.println(names);
		
		names = String.join("$", "John", "Salavat", "Sushma");
		System.out.println(names); // John$Salavat$Sushma
	}
}