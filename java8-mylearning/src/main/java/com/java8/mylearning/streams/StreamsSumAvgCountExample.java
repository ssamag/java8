package com.java8.mylearning.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsSumAvgCountExample {
	
	static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	public static double getAverageSalary() {
		double avgSalary= empList.stream().collect(Collectors.averagingLong(Employee::getSalary));
		System.out.println("<---- Average Salary: " + avgSalary);
		return avgSalary;
	}
	
	public static long getSumOfSalary() {
		long avgSalary= empList.stream().collect(Collectors.summingLong(Employee::getSalary));
		System.out.println("<---- Sum Of  Salary: " + avgSalary);
		return avgSalary;
	}
	
	public static Long getCountOfFemaleEmployee() {
		Long count =  empList.stream().
				filter(emp -> emp.getGender().equalsIgnoreCase("Female")).
				collect(Collectors.counting());
		System.out.println("<---- Count Of  Female Employee: " + count);
		return count;
	}

	public static void main(String[] args) {
		getAverageSalary();
		getSumOfSalary();
		getCountOfFemaleEmployee();
	}

}
