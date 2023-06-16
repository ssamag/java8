package com.java8.mylearning.streams;

import java.util.List;
import static java.util.stream.Collectors.*;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsJoiningExample {
	
	static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	public static String getEmpNames() {
		
		String empNames = empList.stream().
				map(Employee::getName).collect(joining());
		System.out.println("<---getEmpNames: " + empNames);
		return empNames;
	}
	
	public static String getEmpNames_1() {
		
		String empNames = empList.stream().
				map(Employee::getName).collect(joining(" "));
		System.out.println("<---getEmpNames_1: " + empNames);
		return empNames;
	}
	
	public static String getEmpNames_2() {
		
		String empNames = empList.stream().
				map(Employee::getName).collect(joining(",","(",")"));
		System.out.println("<---getEmpNames_2: " + empNames);
		return empNames;
	}

	public static void main(String[] args) {
		
		getEmpNames();
		
		getEmpNames_1();
		
		getEmpNames_2();

	}

}
