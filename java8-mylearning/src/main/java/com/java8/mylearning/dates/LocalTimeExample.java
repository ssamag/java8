package com.java8.mylearning.dates;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: "+ localTime);
		
		LocalTime localTime1 =LocalTime.of(12,45);
		System.out.println("localTime1: "+ localTime1);
		
		LocalTime localTime2 =LocalTime.of(12,45,10);
		System.out.println("localTime2: "+ localTime2);
		
		System.out.println("localTime.getHour(): "+ localTime.getHour());
		System.out.println("localTime.getMinute(): "+ localTime.getMinute());
		System.out.println("localTime.getSecond(): "+ localTime.getSecond());
		System.out.println("localTime.getNano(): "+ localTime.getNano());
		
		
		
		System.out.println("plusHours(1): "+ localTime.plusHours(1));
		System.out.println("plusMinutes(30): "+ localTime.plusMinutes(30));
		System.out.println("minusMinutes(30): "+ localTime.minusMinutes(30));
		System.out.println("minusHours(1): "+ localTime.minusHours(1));
		

	}

}
