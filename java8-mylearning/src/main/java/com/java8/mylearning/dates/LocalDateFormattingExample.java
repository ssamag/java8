package com.java8.mylearning.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFormattingExample {

	public static void parseDates() {
		String date = "2012-09-17";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("<----Parsed Date Is:---->" + localDate);
		
		LocalDate localDate1 = LocalDate.parse(date,DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("<----Parsed Date using formatter:---->" + localDate1);
		
		String isoDate = "20201017";
		LocalDate isoLocalDate = LocalDate.parse(isoDate,DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("<----isoLocalDate:" + isoLocalDate);
		
		String date1 = "2012|09|17";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate formattedLocalDate = LocalDate.parse(date1,dateTimeFormatter);
		System.out.println("<----formattedLocalDate:" + formattedLocalDate);
		
		String date2 = "2020*10*17";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("uuuu*MM*dd");
		LocalDate formattedLocalDate1 = LocalDate.parse(date2,dateTimeFormatter1);
		System.out.println("<----formattedLocalDate1:" + formattedLocalDate1);
	}
	
	public static void formatDates() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		String date = LocalDate.now().format(dateTimeFormatter);
		System.out.println("Formatted date string: " + date);
	}
	
	public static void main(String[] args) {
		parseDates();
		formatDates();
	}

}
