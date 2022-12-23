package day19;

public class Rating {
	enum MovieRating {
		Excellent, Average, Bad
	}
	
	public static void main(String[] args) {
		String res = getRatingMsg(MovieRating.Excellent);
		System.out.println(res);
		
		System.out.println(getRatingMsg(MovieRating.Bad));
	}	
	
	/*
	 * Excellent -> You must see this movie
	 * Average   -> This movie is OK, but not great
	 * Bad       -> Skip it!
	 */
	public static String getRatingMsg(MovieRating rating) {
		String msg;
		
		switch (rating) {
		case Excellent:
			msg = "You must see this movie";
			break;
		case Average:
			msg = "This movie is OK, but not great";
			break;
		case Bad:
			msg = "Skip it!";
			break;
		default:
			msg = "undefined rating";
		}
		
		return msg;
	}
}