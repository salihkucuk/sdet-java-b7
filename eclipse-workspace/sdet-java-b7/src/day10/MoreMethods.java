package day10;

public class MoreMethods {
	public static void main(String[] args) {
		System.out.println(min(1, 5));
		System.out.println(min(7, 6));
		
		bigNumber(1200);
		bigNumber(542);
		
	}
	public static void bigNumber(int number) {
		if(number>1000) {
			System.out.println(number + " is big number");
		}else {
			System.out.println(number + " is regular number");
		}
	}
	
	public static int min(int i, int i2) {
		if(i<i2) {
			return i;
		}else {
			return i2;
		}
	}

}
