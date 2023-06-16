package com.java8.mylearning.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toMap;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class StreamsPartioningByExample {

	static List<Employee> empList = EmployeeDatabase.getEmployees();
	static Predicate<Employee> agePredicate = (emp) -> emp.getAge() >= 30;

	public static Map<Boolean,List<Employee>> getPartitionListByAge(){

		Map<Boolean,List<Employee>> empMap = empList.stream().
				collect(partitioningBy(agePredicate));

		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	public static Map<Boolean,Set<Employee>> getPartitionSetByAge(){

		Map<Boolean,Set<Employee>> empMap = empList.stream().
				collect(partitioningBy(agePredicate,toSet()));

		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	public static Map<Boolean,Map<String,List<String>>> getPartitionMapByAge(){

		Map<Boolean,Map<String,List<String>>> empMap = empList.stream().
				collect(partitioningBy(agePredicate,toMap(Employee::getName,Employee::getSkills)));

		empMap.forEach((key,value) -> System.out.println("Key: " + key + " ,Value: " + value));
		return empMap;
	}
	
	public static void main(String[] args) {
		//getPartitionListByAge();
		//getPartitionSetByAge();
		getPartitionMapByAge();
	}

}
