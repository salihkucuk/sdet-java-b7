package day28;

public class MutableStrBuilder {
	public static void main(String[] args) {
		// StringBuilder is mutable object that hold 
		// sequence of character between double quotes.
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 50; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		// How many StringBuilder object we created from line 5?
		// Only 1
	}
}