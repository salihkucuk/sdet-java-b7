package day19;

public class StrReview {
	public static void main(String[] args) {
		// How to convert int to String?
		int num = 19;
		//     "19"
		String str = String.valueOf(num);
		System.out.println(str);
		
		// trim() - removes the spaces around the value of string and returns it as new string
		String name = "  John Doe  ";
		name = name.trim();
		System.out.println(name);
		
		// isEmpty() - checks if string is empty or not
		String msg = "";
		System.out.println(msg.isEmpty());
		
		// String.join(delimiter, values...)
		String result = String.join(", ", "a", "b", "c", "d", "x");
		System.out.println(result);
		System.out.println("---");
		
		// These methods are available from Java 11
		// isBlank()
		msg = " ";
		System.out.println(msg.isBlank()); // true
		System.out.println(msg.isEmpty()); // false
		
		msg = "abc";
		System.out.println(msg.isBlank()); // false
		System.out.println(msg.isEmpty()); // false
		
		// repeat(count)
		String value = "Java";
		System.out.println(value.repeat(3));
		System.out.println(value);
		value = value.repeat(10);
		System.out.println(value);
	}
}