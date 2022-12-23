package day11;

public class InRange {
	public static void main(String[] args) {
		
		System.out.println(inRange(9));
		System.out.println(inRange(10));
		System.out.println(inRange(15));
		System.out.println(inRange(20));
		System.out.println(inRange(25));
		System.out.println(inRange(100));
	}
	// Logical AND - &&
	// Logical OR - ||
	// Logical NOT - !
	public static boolean inRange(int number) {
		
		if(20>= number && number>=10) {
			return true;
		}
			
		return false;
		
		
	}

}
