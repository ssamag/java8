package com.java8.mylearning.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoublePredicate;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class PredicateExample {

	private static Predicate<Integer> p1 = (i) -> i%2 ==0;
	
	private static Predicate<Integer> p2 = (i) -> i%5 ==0;
	
	private	static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	private static Predicate<Employee> femaleGenderPredicate = (employee) -> "Female".equalsIgnoreCase(employee.getGender());
	
	private static Predicate<Employee> adultAgePredicate = (employee) -> employee.getAge() >= 27;
	
	private static Map<String,List<String>> empMap = new HashMap <>();
	
	private static IntPredicate intPredicate = (i) -> i%2 ==0;
	
	private static DoublePredicate doublePredicate = (i) -> i%4.0 ==0;
	
	
	private static Consumer<Employee> empConsumer = (emp) -> {
		if(femaleGenderPredicate.test(emp)) {
			System.out.println("Employee Name: " + emp.getName() + " Skills:" + emp.getSkills());
		}
	};
	
	private static BiConsumer<Employee , Map<String,List<String>>> biEmpConsumer = (emp,empMap) ->{
		if(adultAgePredicate.test(emp)) {
			empMap.put(emp.getName(), emp.getSkills());
		}
	};
	
	private static Function<List<Employee>, Map<String,List<String>>> empFunction = (empList) -> {
		empList.stream().forEach(emp -> biEmpConsumer.accept(emp,empMap));
		empMap.forEach((key,value) -> System.out.println("Key: " + key + " Value:" + value));
		return empMap;
	};
	
	private static void printEmpNameAndSkillsFromMap() {
		empFunction.apply(empList);
	}
	private static void printEmpNameAndSkills() {
		empList.forEach(empConsumer);
	}
	
	public static void main(String[] args) {

		System.out.println("<--- p1&p2---> :" + p1.and(p2).test(20));
		
		System.out.println("<--- p1orp2---> :" + p1.or(p2).test(6));
		
		System.out.println("<--- p1&p2 negate---> :" + p1.and(p2).negate().test(30));
		
		printEmpNameAndSkills();
		
		System.out.println("<--- From Map---> :");
		
		printEmpNameAndSkillsFromMap();
		
		System.out.println("<--- IntPredicate---> :" + intPredicate.test(20));
		
		System.out.println("<--- DoublePredicate---> :" + doublePredicate.test(20));
		
	}

}
