package com.java8.mylearning.streams;

import java.util.List;
import java.util.function.Predicate;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsMatchExample {

	static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	static Predicate<Employee> femaleGenderPredicate = (employee) -> "Female".equalsIgnoreCase(employee.getGender());
	
	static Predicate<Employee> adultAgePredicate = (employee) -> employee.getAge() >= 27;
	
	static Predicate<Employee> deptPredicate = (employee) -> employee.getDept() == 70;
	
	public static boolean areAllAdultEmployees() {
		boolean areAllAdultEmployees = empList.stream().allMatch(adultAgePredicate);
		System.out.println("<-----areAllAdultEmployees: " + areAllAdultEmployees);
		return areAllAdultEmployees;
	}
	
	public static boolean isAnyFemaleEmployee() {
		boolean isAnyFemaleEmployee = empList.stream().anyMatch(femaleGenderPredicate);
		System.out.println("<-----isAnyFemaleEmployee: " + isAnyFemaleEmployee);
		return isAnyFemaleEmployee;
	}
	
	public static boolean isInvalidDept() {
		boolean isInvalidDept = empList.stream().noneMatch(deptPredicate);
		System.out.println("<-----isInvalidDept: " + isInvalidDept);
		return isInvalidDept;
	}
	
	public static void main(String[] args) {
		
		areAllAdultEmployees();
		
		isAnyFemaleEmployee();
		
		isInvalidDept();
	}
}
