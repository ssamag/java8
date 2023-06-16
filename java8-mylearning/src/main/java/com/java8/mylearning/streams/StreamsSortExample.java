package com.java8.mylearning.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsSortExample {

	static List<Employee> empList = EmployeeDatabase.getEmployees();

	static List<Employee> sortedList = new ArrayList<>();

	// Ascending Sort based on name
	public static List<Employee> getAscendingSortedList() {
		List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println("<----- After Ascending Sorting: ------------>");
		sortedList.forEach(System.out::println);
		return sortedList;
	}

	// Descending Sort based on name
	public static List<Employee> getDescendingSortedList() {
		List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println("<----- After Descending Sorting: ------------>");
		sortedList.forEach(System.out::println);
		return sortedList;
	}
	
	// Descending Sort based on age & name
	public static List<Employee> sortByAgeAndName(){
		Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);
		comparator = comparator.thenComparing(Comparator.comparing(Employee::getName));
		List<Employee> sortedList = empList.stream().sorted(comparator).collect(Collectors.toList());
		System.out.println("<----- Sort By Age & Name: ------------>");
		sortedList.forEach(System.out::println);
		return sortedList;
	}
	
	//Find Second Highest Salary
	
	public static Optional<Employee> getSecondHighestSalary(){
		Optional<Employee> empOptional = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
		System.out.println("<----- Second Highest Salary Employee Is: ------------>" + empOptional.get());
		return empOptional;
	}
	
	public static Optional<Long> getSecondHighestSalaryOnly(){
		Optional<Long> salaryOptional = empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).findFirst();
		System.out.println("<----- Second Highest Salary Is: ------------>" + salaryOptional.get());
		return salaryOptional;
	}
	
	public static Optional<Employee> getSecondLowestSalary(){
		Optional<Employee> empOptional = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst();
		System.out.println("<----- Second Lowest Salary Employee Is: ------------>" + empOptional.get());
		return empOptional;
	}

	public static void main(String[] args) {

		System.out.println("<----- Before Sorting: ------------>");
		empList.forEach(System.out::println);
		getAscendingSortedList();
		getDescendingSortedList();
		sortByAgeAndName();
		getSecondHighestSalary();
		getSecondLowestSalary();
		getSecondHighestSalaryOnly();

	}

}
