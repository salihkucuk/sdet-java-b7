package day16;

public class StrSubstringReview {
	public static void main(String[] args) {
		//            0123456789...
		String str = "Today is day 16";
		// substring(int start)
		// substring(int start, int end)
		
		System.out.println(str.substring(6)); // is day 16
		System.out.println(str); // Today is day 16
		
		System.out.println(str.substring(6, 8)); // is
		System.out.println(str);
		System.out.println("-----");
		
		//             012345
		String name = "Kuba";
		// System.out.println(name.substring(2, 5)); // StringIndexOutOfBoundsException
		
		System.out.println(withoutLastLetter("Kuba")); // Kub
		System.out.println(withoutLastLetter("Beka")); // Bek
		System.out.println(withoutLastLetter("apple")); // appl
		System.out.println(withoutLastLetter("Orange")); // Orang
		System.out.println(withoutLastLetter("Baknazar Suranchiyev")); // Baknazar Suranchiye
	}
	
	/*
	 * Return argument str without last letter
	 *                    0123
	 * withoutLastLetter("Kuba"); -> Kub
	 * withoutLastLetter("Beka"); -> Bek
	 * withoutLastLetter("apple"); -> appl
	 * withoutLastLetter("Orange"); -> Orang
	 */
	public static String withoutLastLetter(String str) {
		return str.substring(0, str.length() - 1);
	}
}