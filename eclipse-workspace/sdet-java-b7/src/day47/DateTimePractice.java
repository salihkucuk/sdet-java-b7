package day47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePractice {
	public static void main(String[] args) {
		// LocalDateTime 
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); // 2022-12-01T20:14:04.347371
		
		now = now.plusDays(2).plusHours(10);
		System.out.println(now);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YY hh:mm a");
		System.out.println(f.format(now)); // 12/04/22 06:17 AM
	}
}