package day12;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(getEvenOddMsg(5)); // odd
		System.out.println(getEvenOddMsg(2)); // even
		System.out.println(getEvenOddMsg(4)); // even
		System.out.println(getEvenOddMsg(10)); // ten
	}
	
	/*
	 * if argument is even return "even" 
	 * except if argument is 10 then return "ten"
	 * otherwise return "odd"
	 * 
	 * num % 2 == 0 -> even
	 */
	public static String getEvenOddMsg(int num) {
		
		if(num % 2 == 0) {
			if(num==10) {
				return"ten";
			}
			return "even";
		}
		return "odd";
	}
}