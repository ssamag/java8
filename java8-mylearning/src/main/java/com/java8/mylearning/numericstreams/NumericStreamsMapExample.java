package com.java8.mylearning.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {
	
	@SuppressWarnings("removal")
	public static List<Integer> mapToObject(){
		List<Integer> intWrapperList = IntStream.rangeClosed(1,5).
				mapToObj(Integer::new).
				collect(Collectors.toList());
		
		System.out.println("<----intWrapperList: " + intWrapperList);
		return intWrapperList;
	}
	
	public static double mapToDouble(){
		double sum = IntStream.rangeClosed(1, 5).mapToDouble(value -> value).sum();
		System.out.println("<----double sum: " + sum);
		return sum;
	}
	
	public static double mapToLong(){
		long sum = IntStream.rangeClosed(1, 5).mapToLong(value -> value).sum();
		System.out.println("<----long sum: " + sum);
		return sum;
	}

	public static void main(String[] args) {
		mapToObject();
		mapToDouble();
		mapToLong();
	}

}
