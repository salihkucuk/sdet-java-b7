package day16;

public class StrReplacePractice {
	public static void main(String[] args) {
		String str = "Apple.Banana.Kiwi.Orange";
		System.out.println(str); // Apple.Banana.Kiwi.Orange
		
		str=str.replace(".", ", ");
		str=str.toLowerCase();
		// TODO 
		// replace(oldValue, newValue)
		// toLowerCase();
		
		System.out.println(str); // apple, banana, kiwi, orange
	}
}