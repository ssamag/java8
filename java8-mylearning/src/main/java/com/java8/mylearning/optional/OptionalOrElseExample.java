package com.java8.mylearning.optional;

import java.util.Optional;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class OptionalOrElseExample {

	public static String optionalOrElse() {
		Optional<Employee> empOptional =Optional.ofNullable(EmployeeDatabase.employeeSupplier.get());
		//Optional<Employee> empOptional = Optional.ofNullable(null);
		String name = empOptional.map(Employee::getName).orElse("Default");
		System.out.println("<----optionalOrElse: " + name);
		return name;
	}
	
	public static String optionalOrElseThrow() {
		Optional<Employee> empOptional = Optional.ofNullable(null);
		String name = empOptional.map(Employee::getName).orElseThrow(() ->new RuntimeException("No Data Found"));
		System.out.println("<----optionalOrElseThrow: " + name);
		return name;
	}
	public static void main(String[] args) {

		optionalOrElse();
		
		optionalOrElseThrow();
	}

}
