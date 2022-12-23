package day47;

import java.time.LocalDate;

public class DatePractice {
	public static void main(String[] args) {
		// Current date
		LocalDate today = LocalDate.now();
		System.out.println(today); // 2022-12-01
		
		System.out.println(today.getDayOfWeek()); // THURSDAY
		System.out.println(today.getMonth()); // DECEMBER
		System.out.println(today.getYear()); // 2022
 		System.out.println(today.getMonthValue()); // 12
 		System.out.println(today.getDayOfMonth()); // 1
 		System.out.println(today.isLeapYear()); // false
 		System.out.println("---");
 		
 		LocalDate birthday = LocalDate.of(1996, 03, 26);
 		System.out.println(birthday.getDayOfWeek()); // TUESDAY
 		System.out.println(birthday.isLeapYear()); // true
 		System.out.println("---");
 		
 		LocalDate someHappyDay = LocalDate.of(2025, 12, 1);
 		System.out.println(someHappyDay.getDayOfWeek());
 		System.out.println(someHappyDay.isLeapYear());
 		
	}
}