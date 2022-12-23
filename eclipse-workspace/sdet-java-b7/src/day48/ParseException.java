package day48;

import java.time.LocalDate;

public class ParseException {
	public static void main(String[] args) {
		String str = "123yb";	
		int num = Integer.parseInt(str); // java.lang.NumberFormatException
		System.out.println(num);
		
		String strDate = "March 12, 2022";
		LocalDate date = LocalDate.parse(strDate); // java.time.format.DateTimeParseException
		System.out.println(date);
	}
}