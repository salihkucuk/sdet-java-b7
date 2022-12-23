package day15;

public class StrNumbers {
	public static void main(String[] args) {
		int res = getNumericValue("one");
		System.out.println(res);
		System.out.println("-----");
		
		System.out.println(getStrValue(2)); // two
		System.out.println(getStrValue(1)); // one
		System.out.println(getStrValue(4)); // four
		System.out.println(getStrValue(5)); // five
		System.out.println(getStrValue(9)); // not supported number
	}
	
	/*
	 * if number is 1, return "one"
	 * if number is 2, return "two"
	 * if number is 3, return "three"
	 * if number is 4, return "four"
	 * if number is 5, return "five"
	 * otherwise return "not supported number"
	 */
	public static String getStrValue(int number) {
		// TODO
		package day14;

		public class Grade {
			public static void main(String[] args) {
				displayScore('a'); // 90 - 100
				displayScore('A'); // 90 - 100
				displayScore('F'); // less than 50
				displayScore('B'); // 65 - 89
				displayScore('C'); // 50 - 64
				
				displayScore('x'); // not valid grade
				displayScore('Y'); // not valid grade
			}
			
			/*
			 * if grade is 'A' or 'a' then print "90 - 100"
			 * if grade is 'B' or 'b' then print "65 - 89"
			 * if grade is 'C' or 'c' then print "50 - 64"
			 * if grade is 'F' or 'f' then print "less than 50"
			 * otherwise print "not valid grade"
			 */
			public static void displayScore(char grade) {
				// TODO
			}
		}package day14;

public class Grade {
	public static void main(String[] args) {
		displayScore('a'); // 90 - 100
		displayScore('A'); // 90 - 100
		displayScore('F'); // less than 50
		displayScore('B'); // 65 - 89
		displayScore('C'); // 50 - 64
		
		displayScore('x'); // not valid grade
		displayScore('Y'); // not valid grade
	}
	
	/*
	 * if grade is 'A' or 'a' then print "90 - 100"
	 * if grade is 'B' or 'b' then print "65 - 89"
	 * if grade is 'C' or 'c' then print "50 - 64"
	 * if grade is 'F' or 'f' then print "less than 50"
	 * otherwise print "not valid grade"
	 */
	public static void displayScore(char grade) {
		// TODO
	}
}package day14;

public class Grade {
	public static void main(String[] args) {
		displayScore('a'); // 90 - 100
		displayScore('A'); // 90 - 100
		displayScore('F'); // less than 50
		displayScore('B'); // 65 - 89
		displayScore('C'); // 50 - 64
		
		displayScore('x'); // not valid grade
		displayScore('Y'); // not valid grade
	}
	
	/*
	 * if grade is 'A' or 'a' then print "90 - 100"
	 * if grade is 'B' or 'b' then print "65 - 89"
	 * if grade is 'C' or 'c' then print "50 - 64"
	 * if grade is 'F' or 'f' then print "less than 50"
	 * otherwise print "not valid grade"
	 */
	public static void displayScore(char grade) {
		// TODO
	}
}package day14;

public class Grade {
	public static void main(String[] args) {
		displayScore('a'); // 90 - 100
		displayScore('A'); // 90 - 100
		displayScore('F'); // less than 50
		displayScore('B'); // 65 - 89
		displayScore('C'); // 50 - 64
		
		displayScore('x'); // not valid grade
		displayScore('Y'); // not valid grade
	}
	
	/*
	 * if grade is 'A' or 'a' then print "90 - 100"
	 * if grade is 'B' or 'b' then print "65 - 89"
	 * if grade is 'C' or 'c' then print "50 - 64"
	 * if grade is 'F' or 'f' then print "less than 50"
	 * otherwise print "not valid grade"
	 */
	public static void displayScore(char grade) {
		// TODO
	}
}package day14;

public class Grade {
	public static void main(String[] args) {
		displayScore('a'); // 90 - 100
		displayScore('A'); // 90 - 100
		displayScore('F'); // less than 50
		displayScore('B'); // 65 - 89
		displayScore('C'); // 50 - 64
		
		displayScore('x'); // not valid grade
		displayScore('Y'); // not valid grade
	}
	
	/*
	 * if grade is 'A' or 'a' then print "90 - 100"
	 * if grade is 'B' or 'b' then print "65 - 89"
	 * if grade is 'C' or 'c' then print "50 - 64"
	 * if grade is 'F' or 'f' then print "less than 50"
	 * otherwise print "not valid grade"
	 */
	public static void displayScore(char grade) {
		// TODO
	}
}
		
	}
	
	/*
	 *	if strNumber "one" or "ONE",   return 1
	 *  if strNumber "two" or "TWO",   return 2
	 *  if strNumber "three" or "THREE", return 3
	 *  if strNumber "four" or "FOUR",  return 4
	 *  if strNumber "five" or "FIVE",  return 5
	 *  otherwise return -1
	 */
	public static int getNumericValue(String strNumber) {
		switch(strNumber) {
		case "one", "ONE":
			return 1;
		case "two":
		case "TWO":	
			return 2;
		case "three", "THREE":
			return 3;
		case "four", "FOUR":
			return 4;
		case "five", "FIVE":
			return 5;
		default:
			return -1;
		}
	}
}