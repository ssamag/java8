package com.java8.mylearning.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsMinMaxByExample {
	
	static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	//Find Highest Salary Employee
	  public static Optional<Employee> getHighestSalEmployee(){

	        Optional<Employee> employeeOptional = empList.stream()
	                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	        
	        return employeeOptional;
	    }
	  
	//Find All Highest Salary Employee
	  public static List<Employee> getAllHighestSalEmployees(){

	        Optional<Employee> maxemployeeOptional = empList.stream()
	                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	        
	        List<Employee> highestEmpList = new ArrayList<>();
	        
	        if(maxemployeeOptional.isPresent()) {
	        	highestEmpList = empList.stream().filter(emp -> emp.getSalary().equals(maxemployeeOptional.get().getSalary()))
	        	.collect(Collectors.toList());
	        	
	        }
	        return highestEmpList;
	    }
	  
	//Find Lowest Salary Employee
	  public static Optional<Employee> getLowestSalEmployee(){

	        Optional<Employee> employeeOptional = empList.stream()
	                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
	        
	        return employeeOptional;
	    }

	public static void main(String[] args) {
		
		Optional<Employee> empOptional = getHighestSalEmployee();
		System.out.println("<--- Highest Salary Employee: " + empOptional);
		
		Optional<Employee> empOptional1 = getLowestSalEmployee();
		System.out.println("<--- Lowest Salary Employee: " + empOptional1);
		
		List<Employee> highestEmpList = getAllHighestSalEmployees();
		System.out.println("<--- Highest Salary Employee List: " + highestEmpList + "Count: " + highestEmpList.size());
		
		
		
		

	}

}
