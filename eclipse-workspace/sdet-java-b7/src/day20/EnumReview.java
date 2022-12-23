package day20;

public class EnumReview {
	enum Color {
		Red, Green, Yellow, Blue, White
	}
	
	public static void main(String[] args) {
		Color myColor = Color.Green;
		System.out.println(myColor);
		
		System.out.println(getHashForColor(Color.Red));
		System.out.println(getHashForColor(Color.Green));
		
		System.out.println(getHashForColor(Color.White)); // exception coming here
		
		System.out.println("Good morning class!");
	}
	
	public static String getHashForColor(Color color) {
		switch (color) {
		case Red:
			return "#E74C3C";
		case Green:
			return "#58D68D";
		case Yellow:
			return "#F9E79F";
		case Blue:
			return "#5DADE2";
		default:
			throw new IllegalArgumentException("Undefined color - " + color);
		}
	}
}