package com.java8.mylearning.streams;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsGroupingByExample {
	
	static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	//Group By Gender
	
	public static Map<String ,List<Employee>> getEmployeesByGender(){
		Map<String ,List<Employee>> empMap= empList.stream().collect(groupingBy(Employee::getGender));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	//Custom Group By Age
	public static Map<String ,List<Employee>> getEmployeesByAge(){
		Map<String ,List<Employee>> empMap= empList.stream().collect(groupingBy(employee -> employee.getAge()<=30 ? "Young" : "Adult"));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	//Employee count by gender
	public static Map<String ,Long> getEmployeesCountByGender(){
		Map<String ,Long> empMap= empList.stream().collect(groupingBy(Employee::getGender,counting()));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	//Employee by gender & age
	
	public static Map<String,Map<String,List<Employee>>> getEmployeesByGenderAndAge(){
		Map<String,Map<String,List<Employee>>> empMap = empList.stream().collect(groupingBy(Employee::getGender,
				groupingBy(employee -> employee.getAge()<=30 ? "Young" : "Adult")));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	//Employee by dept,returns set
	
	public static Map<Integer, Set<Employee>> getEmployeesByDept(){
		Map<Integer, Set<Employee>> empMap= empList.stream().collect(groupingBy(Employee::getDept,toSet()));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	//Highest salary depat wise
	
	public static void calculateHighestSalDeptWise(){
		Map<Integer, Optional<Employee>> empMap = empList.stream().collect(groupingBy(Employee::getDept,maxBy(Comparator.comparing(Employee::getSalary))));
		//empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		
		Map<Integer,Employee> empMap1 = empList.stream().collect(groupingBy(Employee::getDept,
				collectingAndThen(maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
		
		empMap1.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
	}
	
	public static void calculateLowestSalDeptWise() {
		Map<Integer,Employee> empMap = empList.stream().collect(groupingBy(Employee::getDept,
				collectingAndThen(minBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
	}
	
	public static Map<Integer,Long> getSumOfSalDeptWise(){
		Map<Integer,Long> empMap = empList.stream().collect(groupingBy(Employee::getDept,summingLong(Employee::getSalary)));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	public static Map<Integer,Double> getAvgOfSalDeptWise(){
		Map<Integer,Double> empMap = empList.stream().collect(groupingBy(Employee::getDept,averagingLong(Employee::getSalary)));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	public static void main(String[] args) {
		//getEmployeesByGender();
		//getEmployeesByAge();
		//getEmployeesCountByGender();
		//getEmployeesByGenderAndAge();
		//getEmployeesByDept();
		//calculateHighestSalDeptWise();
		//calculateLowestSalDeptWise();
		//getSumOfSalDeptWise();
		getAvgOfSalDeptWise();
	}
}
