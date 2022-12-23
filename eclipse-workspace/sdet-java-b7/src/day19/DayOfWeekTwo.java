package day19;

public class DayOfWeekTwo {
	
	public static void main(String[] args) {
		dislayDayMsg(Day.Mon); // Homework day!
		dislayDayMsg(Day.Wed); // Relaxing day!
		dislayDayMsg(Day.Sun); // Kahoot day!
		// no need to create new enum
	}
	
	/*
	 * Based on the day print following messages:
	 * Mon - Homework day!
	 * Tue - Study day!
	 * Wed - Relaxing day!
	 * Thur - Study day!
	 * Fri - Coding day!
	 * Sat - Java epic day!
	 * Sun - Kahoot day! 
	 */
	public static void dislayDayMsg(Day day) {
		switch(day) {
		case Mon:
			System.out.println("Homework day!");
			break;
		case Tue:
		case Thur:	
			System.out.println("Study day!");
			break;
		case Wed:
			System.out.println("Relaxing day!");
			break;
		case Fri:
			System.out.println("Coding day!");
			break;
		case Sat:
			System.out.println("Java epic day!");
			break;
		case Sun:
			System.out.println("Kahoot day!");
			break;
		default:
			System.out.println("Undefined day");
		}
	}
}
