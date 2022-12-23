package day48;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Today {
	public static void main(String[] args) {
	LocalDateTime now = LocalDateTime.now();
	System.out.println(now);
	
	DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.YY");
	String todayStr = f.format(now);
	System.out.println(todayStr);
}
}
