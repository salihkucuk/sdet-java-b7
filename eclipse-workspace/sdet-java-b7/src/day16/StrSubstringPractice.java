package day16;

public class StrSubstringPractice {
	public static void main(String[] args) {
		//             0123456789
		String  str = "HelloWorld";
		String str2 = "SDLC";
		String str3 = "Sublime";
		String str4 = "Window";
		String str5 = "OptimizePDF";
		String str6 = "Navigate";
		String str7 = "Search";
		
		// TODO
		System.out.println(str.substring(3, 6)); // loW
		System.out.println(str2.substring(1, 3)); // DL
		System.out.println(str3.substring(2, 4)); // bl
 		System.out.println(str4.substring(1, 4)); // ind
 		System.out.println(str5.substring(8, 11)); // PDF
		System.out.println(str6.substring(0, 3)); // Nav
		System.out.println(str7.substring(1, 4)); // ear
	}
}