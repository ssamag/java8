package com.java8.mylearning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsReduceExample {

	static List<Employee> empList = EmployeeDatabase.getEmployees();
	static List<Integer> integerList =  Arrays.asList(1,2,3,4);
	
	public static void doArithmaticOperations() {
		//int sum =integerList.stream().reduce(0,(a,b) -> a+b);
		int sum =integerList.stream().reduce(0,Integer::sum);
		System.out.println("<---Sum is: " + sum);
		
		int multiplication =integerList.stream().reduce(1,(a,b) -> a*b);
		//int multiplication =integerList.stream().reduce(Integer::mult);
		System.out.println("<---Multiplication is: " + multiplication);
		
		int maxValue =integerList.stream().reduce(0,Integer::max);
		System.out.println("<---Max Value is: " + maxValue);
		
		int minValue =integerList.stream().reduce(0,Integer::min);
		System.out.println("<---Min Value is: " + minValue);
		
		Optional<Employee> empOptional = empList.stream().reduce((emp1,emp2) -> emp1.getSalary() >= emp2.getSalary() ? emp1 : emp2);
		System.out.println("<---Highest Salary Employee: " + empOptional);
		
		Optional<Employee> empOptional1 = empList.stream().reduce((emp1,emp2) -> emp1.getSalary() <= emp2.getSalary() ? emp1 : emp2);
		System.out.println("<---Lowest Salary Employee: " + empOptional1);
		
		long sumOfSalary = empList.stream().map(Employee::getSalary).reduce(0l,Long::sum);
		
		System.out.println("<---Sum of Salary : " + sumOfSalary);
		
	}
	
	public static void main(String[] args) {
		doArithmaticOperations();
	}

}
