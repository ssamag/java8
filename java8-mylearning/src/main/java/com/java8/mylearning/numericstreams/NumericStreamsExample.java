package com.java8.mylearning.numericstreams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static void performCalculations() {
		System.out.println("Sum is: " + IntStream.rangeClosed(1, 10).sum());
		System.out.println("Count is: " + IntStream.rangeClosed(1, 10).count());
		System.out.println("Average is: " + IntStream.rangeClosed(1, 10).average().getAsDouble());
		
		System.out.println("<---- Range Values Are: ---->");
		IntStream.range(1, 10).forEach(value -> System.out.println(value));
		
		System.out.println("<---- Range ClosedValues Are: ---->");
		IntStream.rangeClosed(1, 10).forEach(value -> System.out.println(value));
		
		double  doubleSum = IntStream.rangeClosed(1, 10).asDoubleStream().sum();
		System.out.println("<----doubleSum: " + doubleSum);
		
		double  doubleAverage= IntStream.rangeClosed(1, 10).asLongStream().average().getAsDouble();
		System.out.println("<----doubleAverage: " + doubleAverage);
		
		OptionalInt maxOptional = IntStream.range(1, 10).max();
		System.out.println("<-------------maxOptional: "   + maxOptional.getAsInt());
		
		OptionalInt minOptional = IntStream.rangeClosed(1, 10).min();
		System.out.println("<-------------minOptional: "   + minOptional.getAsInt());
	}
	public static void main(String[] args) {
		performCalculations();
	}

}
