package day16;

public class StrIndexOf {
	public static void main(String[] args) {
		//            0123456789...   16 ...      28
		String str = "Java is a great programming language";
		// indexOf(char ch) it returns the index position of first char in the string
		int index = str.indexOf('i');
		System.out.println(index);
		
		System.out.println(str.indexOf('x')); // -1
		
		// indexOf(String str)
		int startIndex = str.indexOf("program");
		System.out.println(startIndex);
		
		System.out.println(str.indexOf("lan"));
		System.out.println(str.indexOf("abc")); // -1
		System.out.println("-------");
		
		//                   9             14
		String text = "hello {Aloha Friends!} bob abc xyz asdfjksdfasdfkj cool java";
		// {value}
		int indexOfStart = text.indexOf('{');
		int indexOfEnd = text.indexOf('}');
		
		String value = text.substring(indexOfStart + 1, indexOfEnd);
		System.out.println(value);
	}
}