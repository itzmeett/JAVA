package com.assignments;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemTime {
	public static void main(String args[]) {
		
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		String formattedTime = time.format(formatter);
	
		System.out.println("Current Time = " + formattedTime);
		
//		int day = time.getDayOfMonth();
//		int month = time.getMonthValue();
//		System.out.println(month +" "+ day);
	}
}
