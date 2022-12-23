package day28;

public class SbMethods {
	public static void main(String[] args) {
		// charAt(), indexOf(), length(), substring()
		
		//                                     01234567
		StringBuilder day = new StringBuilder("Thursday");
		char ch = day.charAt(2);
		System.out.println(ch); // u
		
		int index = day.indexOf("day");
		System.out.println(index); // 5
		
		int len = day.length();
		System.out.println("Size: " + len); // Size: 8
		
		// substring() return String when used with StringBuilder
		String subStr = day.substring(0, 4);
		System.out.println(subStr); // Thur
		System.out.println("---");
		
		// insert(index, value)
		StringBuilder sb = new StringBuilder("animals");
		System.out.println(sb); // animals
		
		sb.insert(0, "the ");   // 0123456789
		System.out.println(sb); // the animals
		
		sb.insert(3, " good");  // 012345678910
		System.out.println(sb); // the good animals
		
		// delete(start, end)
		sb.delete(4, 9);
		System.out.println(sb); // the animals
		
		//                                     012345
		StringBuilder sb2 = new StringBuilder("abcdef");
		System.out.println(sb2);
		sb2.delete(2, 4);
		System.out.println(sb2); // abef
		
		StringBuilder sb3 = new StringBuilder("aasasdfwefdgfxdcfjvgkbhlnj");
		sb3.delete(1, sb3.length() - 1);
		System.out.println(sb3); // aj
		
		sb3.append("java");
		System.out.println(sb3); // ajjava
		sb3.deleteCharAt(0); // delete first char
		
		System.out.println(sb3); // jjava
		sb3.deleteCharAt(1); // delete second char
		System.out.println(sb3);
		
		StringBuilder name = new StringBuilder("John Doe");
		System.out.println(name); // John Doe
		
		name.reverse();
		System.out.println(name); // eoD nhoJ
	}
}