package day47;

import java.time.LocalTime;

public class TimePractice {
	public static void main(String[] args) {
		// LocalTime
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		int hour = now.getHour();
		System.out.println("hour: " + hour);
		
		int minutes = now.getMinute();
		System.out.println("minutes: " + minutes);
		
		int seconds = now.getSecond();
		System.out.println("seconds: " + seconds);
		
		int nanoSeconds = now.getNano();
		System.out.println("nano seconds: " + nanoSeconds);
		System.out.println("---");
		
		LocalTime time = LocalTime.of(7, 5, 10);
		System.out.println(time);
		
		LocalTime afterSomeTime = now.plusSeconds(7530);
		System.out.println(afterSomeTime);
	}
}