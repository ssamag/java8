package com.java8.mylearning.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorsExample {

	private static UnaryOperator<Integer> unaryOperator = (i) -> i/5;
	
	private static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
	
	private static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
	
	private static BinaryOperator<Integer> maxByOperator = BinaryOperator.maxBy(comparator);
	
	private static BinaryOperator<Integer> minByOperator = BinaryOperator.minBy(comparator);
	
	public static void main(String[] args) {

		System.out.println("<----unaryOperator: " + unaryOperator.apply(45));
		
		System.out.println("<----binaryOperator: " + binaryOperator.apply(5,9));
		
		System.out.println("<-----Max By: " + maxByOperator.apply(23, 49));
		
		System.out.println("<-----Min By: " + minByOperator.apply(23, 49));
	}

}
