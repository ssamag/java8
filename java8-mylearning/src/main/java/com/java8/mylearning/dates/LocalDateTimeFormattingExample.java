package com.java8.mylearning.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormattingExample {
	
	public static void parseDateTime() {
		
		String dateTime = "2012-09-17T14:20:25";
		LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
		System.out.println("<-----localDateTime: " + localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime,DateTimeFormatter.ISO_DATE_TIME);
		System.out.println("<-----localDateTime1: " + localDateTime1);
		
		String formattedDateTime = "2012|09|1714*20*25";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|ddHH*mm*ss");
		LocalDateTime formattedLocalDateTime = LocalDateTime.parse(formattedDateTime, dateTimeFormatter);
		System.out.println("<-----formattedLocalDateTime: "+ formattedLocalDateTime);
		
		String anotherFormattedDateTime = "2012||09||17abc14**20**25";
		DateTimeFormatter anotherDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy||MM||dd'abc'HH**mm**ss");
		LocalDateTime anotherFormattedLocalDateTime = LocalDateTime.parse(anotherFormattedDateTime, anotherDateTimeFormatter);
		System.out.println("<-----anotherFormattedLocalDateTime: "+ anotherFormattedLocalDateTime);
	}
	
	public static void formatDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		String formattedDateTime =localDateTime.format(DateTimeFormatter.ofPattern("yyyy||MM||dd'abc'HH**mm**ss"));
		System.out.println("<----formattedDateTime: " + formattedDateTime);
	}

	public static void main(String[] args) {
		parseDateTime();
		
		formatDateTime();
	}

}
