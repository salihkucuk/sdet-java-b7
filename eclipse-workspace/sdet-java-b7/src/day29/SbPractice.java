package day29;

public class SbPractice {
	public static void main(String[] args) {
		String alphabet = buildAlphabet();
		System.out.println(alphabet); // ABCDEFGHIJKLMNOPQRSTUVWXY
		System.out.println("---");
		
		String res = getNumberStrRange(1, 10);
		System.out.println(res); // 12345678910
		
		res = getNumberStrRange(5, 15);
		System.out.println(res); // 56789101112131415
	}
	
	/*
	 * Generate alphabet
	 */
	public static String buildAlphabet() {
		StringBuilder res = new StringBuilder();
		for (char ch = 'A'; ch < 'Z'; ch++) {
			res.append(ch);
		}
		return res.toString();
	}
	
	/*
	 * getNumberStrRange(1, 10); -> "12345678910"
	 * getNumberStrRange(5, 15); -> "56789101112131415"
	 */
	public static String getNumberStrRange(int start, int end) {
		// TODO refactor this
		StringBuilder resNumberRange = new StringBuilder();
		
		for (int i = start; i <= end; i++) {
			resNumberRange.append(i);
		}
		return resNumberRange.toString();
	}
}