package day47;

import java.time.LocalDate;

public class StrToDatesTask {
	public static void main(String[] args) {
		// Scenario:
		// You are testing the order date
		// "Order date 2022-02-08"
		//                       YYYY-MM-dd
		String str = "Order date 2022-02-08";
		
		// TODO confirm if this date is before today
		// 1. Get date part of the string (split)
		str = str.split(" ")[2];
		
		// 2. Parse string date to LocalDate
		LocalDate orderDate = LocalDate.parse(str);
		
		// 3. Create today's LocalDate
		LocalDate today = LocalDate.now();
		
		// 4. Compare them by using orderDate.isBefore(today) 
		if (orderDate.isBefore(today)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
		}
	}
}