package day15;

public class StrSubstring {
	public static void main(String[] args) {
		// some of the method depend on index positions
		// the positions begin with 0
		
		//            012345678910
		String str = "Java is fun";
		
		// Using substring methods we can get part of the string based on index
		
		// substring(int start)
		String javaFun = str.substring(8);
		
		System.out.println(str); // Java is fun
		System.out.println(javaFun); // fun
					
		//         012345678910
		//		   Java is fun
		String subStr = str.substring(3);
		System.out.println(subStr); // a is fun
		System.out.println(str); // Java is fun
		
		//               0123456789
		String strTwo = "SoftSkills";
		strTwo = strTwo.substring(4);
		System.out.println(strTwo); // Skills
		System.out.println("----------");
		
		// substring(int start, int end)
		//                0123456789...
		String javaStr = "Java is cool!";
		String java = javaStr.substring(0, 4);
		System.out.println(javaStr);
		System.out.println(java);
		
		String javaTwo = javaStr.substring(0, 7);
		System.out.println(javaTwo);
		
		String javaIs = javaStr.substring(5, 7);
		System.out.println(javaIs);
	}
}