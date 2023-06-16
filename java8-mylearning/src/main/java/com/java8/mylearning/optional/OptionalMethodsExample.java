package com.java8.mylearning.optional;

import java.util.Optional;

public class OptionalMethodsExample {

	public static Optional<String> ofNullable(){
		//Optional<String> stringOptional = Optional.ofNullable("Hello Optional ofNullable");
		Optional<String> stringOptional = Optional.ofNullable(null);
		System.out.println("<----ofNullable: " + stringOptional);
		return stringOptional;
	}
	
	public static Optional<String> of(){
		Optional<String> stringOptional = Optional.of("Hello Optional Of");
		//Optional<String> stringOptional = Optional.of(null);
		System.out.println("<----of: " + stringOptional);
		return stringOptional;
	}
	
	public static Optional<String> ofEmpty(){
		//Optional<String> stringOptional = Optional.of("Hello Optional Of");
		Optional<String> stringOptional = Optional.empty();
		System.out.println("<----ofEmpty: " + stringOptional);
		return stringOptional;
	}
	
	
	public static void main(String[] args) {
		ofNullable();
		of();
		ofEmpty();
	}

}
