package day47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StrToDateTask2 {
	public static void main(String[] args) {
		String str = "Deleted date is 12/01/2022";
		
		// TODO Make sure deleted date is today's date
		// 1. Get date part from str
		String[] parts = str.split(" ");
		str = parts[parts.length - 1];
		System.out.println(str); // 12/01/2022
		
		// 2. Convert to LocalDate by using DateTimeFormatter
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		LocalDate deletedDate = LocalDate.parse(str, f);
		System.out.println(deletedDate);
		
		// 3. Create today's date
		LocalDate today = LocalDate.now();
		
		// 4. Compare two dates
		if (today.equals(deletedDate)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
		}
	}
}