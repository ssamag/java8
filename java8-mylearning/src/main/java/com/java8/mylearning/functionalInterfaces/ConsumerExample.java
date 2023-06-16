package com.java8.mylearning.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

import com.java8.mylearning.data.Employee;
import com.java8.mylearning.data.EmployeeDatabase;

public class ConsumerExample {

	private static Consumer<String> upperCaseConsumer = (str) -> System.out.println(str.toUpperCase());
	
	private static Consumer<Integer> numberConsumer = (i) -> System.out.println(i*2);
	
	private static Consumer<IntStream> streamConsumer = (intStream) ->System.out.println(intStream.sum());
	
	private static Consumer<Employee> empConsumer = (emp) -> System.out.println(emp.getName().toUpperCase());
	
	private static Consumer<Employee> empConsumer1 = (emp) -> System.out.println(emp.getSkills());
	
	private	static List<Employee> empList = EmployeeDatabase.getEmployees();
	
	private static BiConsumer<String, String> stringConsumer = (str1,str2) -> System.out.println(str1.concat(str2));
	
	private static BiConsumer<Integer, Integer> integerConsumer = (int1,int2) -> System.out.println(int1 + int2);
	
	private static BiConsumer<String, List<String>> empBiConsumer = (name,skills) -> System.out.println(name + ":" + skills);
	
	private static IntConsumer intConsumer = (i) -> System.out.println("<---- intConsumer" + i*2);
	
	private static DoubleConsumer doubleConsumer = (i) -> System.out.println("<---- doubleConsumer" + i*2.0);
	
	public static void acceptConsumers() {
		upperCaseConsumer.accept("saNdIP");
		numberConsumer.accept(2);
		streamConsumer.accept(IntStream.rangeClosed(1, 5));
		empList.forEach(empConsumer.andThen(empConsumer1));
		stringConsumer.accept("Hello", " World");
		integerConsumer.accept(10, 20);
		empList.forEach(emp -> empBiConsumer.accept(emp.getName(), emp.getSkills()));
		intConsumer.accept(10);
		doubleConsumer.accept(10);
	}
	
	public static void main(String[] args) {
		acceptConsumers();
	}

}
