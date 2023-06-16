package com.java8.mylearning.functionalInterfaces;

import java.util.function.Function;
import java.util.function.Supplier;

import com.java8.mylearning.data.Employee;

public class ConstructorReferenceExample {

	private static Supplier<Employee> empSupplier = Employee::new;
	
	private static Function<String,Employee> empFunction = Employee::new;
	
	public static void main(String[] args) {
		
		System.out.println("<---Employee Supplier: " + empSupplier.get());
		
		System.out.println("<---Employee Function: " + empFunction.apply("defaultName"));
	}

}
