package com.java8.mylearning.dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeFormattingExample {
	
	public static void parseTime() {
		
		String time = "10:20";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("<-----localTime:" + localTime);
		
		LocalTime localTime1 = LocalTime.parse(time,DateTimeFormatter.ISO_TIME);
		System.out.println("<-----localTime1:" + localTime1);
		
		String timeFormat = "18|20";
		LocalTime formattedLocalTime = LocalTime.parse(timeFormat,DateTimeFormatter.ofPattern("HH|mm"));
		System.out.println("<-----formattedLocalTime:" + formattedLocalTime);
		
		String anotherTimeFormat = "18*20";
		LocalTime anotherTimeFormatLocalTime = LocalTime.parse(anotherTimeFormat,DateTimeFormatter.ofPattern("HH*mm"));
		System.out.println("<-----anotherTimeFormatLocalTime:" + anotherTimeFormatLocalTime);
	}
	
	public static void formatTime() {
		
		LocalTime localTime = LocalTime.now();
		String formattedTimeString = localTime.format(DateTimeFormatter.ofPattern("HH|mm"));
		System.out.println("<---- formattedTimeString: " + formattedTimeString);
		
		String anothetrFormattedTimeString = localTime.format(DateTimeFormatter.ofPattern("HH*mm*ss"));
		System.out.println("<---- anothetrFormattedTimeString: " + anothetrFormattedTimeString);
	}

	public static void main(String[] args) {
		parseTime();
		formatTime();
	}

}
