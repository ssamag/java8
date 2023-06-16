package com.java8.mylearning.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date Is: "  +localDate);
		
		LocalDate customLocalDate = LocalDate.of(2012, 9, 17);
		
		LocalDate customLocalDate1 = LocalDate.of(2012, 9, 17);
		
		System.out.println("customLocalDate Is: "  +customLocalDate);
		
		int compareDates = localDate.compareTo(customLocalDate);
		System.out.println("compareDates using comapreto:" + compareDates);
		
		System.out.println("compareDates using equals:" + customLocalDate1.equals(customLocalDate));
		
		System.out.println("Month Name:" + localDate.getMonth());
		System.out.println("Month Value:" + localDate.getMonthValue());
		System.out.println("DayOfMonth:" + localDate.getDayOfMonth());
		System.out.println("DayOfWeek:" + localDate.getDayOfWeek());
		System.out.println("DayOfYear:" + localDate.getDayOfYear());
		System.out.println("Year:" + localDate.getYear());
		
		
		System.out.println("plusDays(3):" + localDate.plusDays(3));
		System.out.println("plusDays(2):" + localDate.plus(2, ChronoUnit.DAYS));
		
		System.out.println("plusWeeks(1):" + localDate.plusWeeks(1));
		System.out.println("plusWeeks(2):" + localDate.plus(2, ChronoUnit.WEEKS));
		
		System.out.println("plusMonths(3):" + localDate.plusMonths(3));
		System.out.println("plusMonths(2):" + localDate.plus(2, ChronoUnit.MONTHS));
		
		System.out.println("plusYears(3):" + localDate.plusYears(3));
		System.out.println("plusYears(2):" + localDate.plus(2, ChronoUnit.YEARS));
		
		System.out.println("minusDays(3):" + localDate.minusDays(3));
		System.out.println("minusDays(2):" + localDate.plusDays(-2));
		
		System.out.println("minusWeeks(3):" + localDate.minusWeeks(3));
		
		System.out.println("minusMonths(3):" + localDate.minusMonths(3));
		
		System.out.println("minusYears(3):" + localDate.minusYears(3));
		
		System.out.println("isAfter:" + localDate.isAfter(customLocalDate));
		
		System.out.println("isBefore:" + customLocalDate.isBefore(localDate));
		
		
		
	}

}
