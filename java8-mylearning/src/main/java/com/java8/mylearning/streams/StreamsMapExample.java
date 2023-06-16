package com.java8.mylearning.streams;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsMapExample {

	static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	public static List<String> getNamesOfAllEmployees(){
		List<String> empNames = empList.stream().map(Employee::getName).collect(toList());
		System.out.println("<----- getNamesOfAllEmployees using list: " + empNames);
		return empNames;
	}
	
	public static Set<String> getNamesOfAllEmployeesSet(){
		Set<String> empNames = empList.stream().map(Employee::getName).collect(toSet());
		System.out.println("<----- getNamesOfAllEmployeesSet using set: " + empNames);
		return empNames;
	}
	
	public static Set<String> getNamesOfAllEmployeesMapping(){
		Set<String> empNames = empList.stream().collect(mapping(Employee::getName,toSet()));
		System.out.println("<----- getNamesOfAllEmployeesMapping using set: " + empNames);
		return empNames;
	}
	
	public static List<String> getEmployeeSkills(){
		List<String> empSkills = empList.stream().map(Employee::getSkills) // stream of List<String>
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.collect(toList());
		System.out.println("<----- getEmployeeSkills : " + empSkills);
		return empSkills;
	}
	
	public static long getEmployeeSkillsCount(){
		long skillCount = empList.stream().map(Employee::getSkills) // stream of List<String>
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.count();
		System.out.println("<----- skillCount : " + skillCount);
		return skillCount;
	}
	
	
	public static void main(String[] args) {
		
		//getNamesOfAllEmployees();
		
		//getNamesOfAllEmployeesSet();
		
		//getNamesOfAllEmployeesMapping();
		
		getEmployeeSkills();
		
		getEmployeeSkillsCount();
	}

}
