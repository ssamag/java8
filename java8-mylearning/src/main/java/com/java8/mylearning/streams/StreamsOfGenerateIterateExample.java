package com.java8.mylearning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("Sandip","Kamalakshi,","Anvay","Raghav");
		System.out.println("<--- String Stream :---->");
		stringStream.sorted().forEach(System.out::println);
		
		Stream<Integer> integerStream = Stream.of(9,13,5,11,15);
		System.out.println("<--- Integer Stream :---->");
		integerStream.sorted().forEach(System.out::println);
		
		List<Integer> intList = Stream.iterate(1, (i) -> i*2)
		.limit(5)
	//	.map(Integer::new)
		.collect(Collectors.toList());
		
		 System.out.println("<----Iterate : ---->" + intList);
		 
		 //List<String> stringList = Arrays.asList("Sandip","Kamalakshi,","Anvay","Raghav");
		 Supplier<List<String>> stringListSupplier = () -> Arrays.asList("Sandip","Kamalakshi,","Anvay","Raghav");
		 Stream.generate(stringListSupplier).limit(5).forEach((System.out::println));
	}

}
