package com.java8.mylearning.streams;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsFindFirstAnyExample {
	
static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	static Predicate<Employee> femaleGenderPredicate = (employee) -> "Female".equalsIgnoreCase(employee.getGender());
	
	static Predicate<Employee> adultAgePredicate = (employee) -> employee.getAge() >= 27;
	
	public static Optional<Employee> getFirstFemaleEmployee(){
		Optional<Employee> empOptional = empList.stream().filter(femaleGenderPredicate).findFirst();
		System.out.println("<-------getFirstFemaleEmployee:  " + empOptional);
		return empOptional;
	}
	
	public static Optional<Employee> getAnyAdultEmployee(){
		Optional<Employee> empOptional = empList.stream().filter(adultAgePredicate).findAny();
		System.out.println("<-------getAnyAdultEmployee: " + empOptional);
		return empOptional;
	}

	public static void main(String[] args) {
		getFirstFemaleEmployee();
		getAnyAdultEmployee();

	}

}
