package com.java8.mylearning.functionalInterfaces;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class FunctionExample {

	private static Function<String,String> upperCaseFunction = (str) -> str.toUpperCase();
	private static Function<String,String> concatFunction = (str) -> str.concat("default");
	private static Function<String,String> identityFunction = Function.identity();
	private static Predicate<Employee> adultAgePredicate = (employee) -> employee.getAge() >= 27;
	private static BiFunction<Integer,Integer,Integer> additionFunction = (a,b) -> a + b;
	private	static List<Employee> empList = EmployeeDatabase.getEmployees();
	private static Function<List<Employee>,Optional<Employee>> highestSalFunction = (empList) ->empList.stream().
			collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	
	private static BiFunction<List<Employee>,Predicate<Employee>,Map<String,Long>> empNameSalFunction = (empList,empPredicate) -> {
		Map<String,Long> empMap = new HashMap<>();
		empList.forEach((emp) -> {
			if(empPredicate.test(emp)) {
				empMap.put(emp.getName(), emp.getSalary());
			}
		});
		return empMap;
	};
	public static void applyFunction() {
		String toUpperCase = upperCaseFunction.andThen(concatFunction).apply("sandip");
		System.out.println("<----toUpperCase---->: "+ toUpperCase);
		
		String identity = identityFunction.apply("ABC");
		System.out.println("<----Identity---->: "+ identity);
		
		Optional<Employee> empOptional = highestSalFunction.apply(empList);
		System.out.println("<----Highest Salary Employee---->: "+ empOptional);
		
		Integer sum = additionFunction.apply(10, 20);
		System.out.println("<----Sum is: " + sum);
		
		Map<String,Long> empMap = empNameSalFunction.apply(empList, adultAgePredicate);
		empMap.forEach((key,value)-> System.out.println("Key: " + key + "" + " Value:" + value));
	}
	public static void main(String[] args) {
		applyFunction();

	}
                                                                                                                                                                                                                                                                                                                                             
}
