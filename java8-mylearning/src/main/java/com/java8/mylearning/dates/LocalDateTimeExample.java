package com.java8.mylearning.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("<---localDateTime:" + localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.of(2018, 12, 10, 20, 30);
		System.out.println("<---localDateTime1:" + localDateTime1);
		
		System.out.println("<---Year:" + localDateTime.getYear());
		System.out.println("<---Hour:" + localDateTime.getHour());
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("<----localDate.atTime(10,20):" + localDate.atTime(10,20));
		
		LocalTime localTime = LocalTime.now();
		
		System.out.println("<---localTime.atDate:" + localTime.atDate(localDate));
		
		System.out.println("<----localDateTime.toLocalDate():" + localDateTime.toLocalDate());
		
		System.out.println("<----localDateTime.toLocalTime():" + localDateTime.toLocalTime());
		
	}

}
