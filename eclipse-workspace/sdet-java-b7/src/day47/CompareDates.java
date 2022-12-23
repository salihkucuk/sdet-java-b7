package day47;

import java.time.LocalDate;
import java.time.Month;

public class CompareDates {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate someDate = LocalDate.of(2022, Month.NOVEMBER, 25); // 2022-11-25
		System.out.println(someDate);
		
		// today is after someDate? true
		System.out.println(today.isAfter(someDate)); // true
		
		// today is before someDate? false
		System.out.println(today.isBefore(someDate)); // false
		
		// today is equals someDate? false
		System.out.println(today.equals(someDate)); // false
		
		// Local dates and times are immutable object
		someDate = someDate.plusDays(50);
		System.out.println(someDate); // 2023-01-14
		
		someDate = someDate.plusWeeks(2);
		System.out.println(someDate); // 2023-01-28
		
		someDate = someDate.minusWeeks(3);
		System.out.println(someDate); // 2023-01-07
	}
}