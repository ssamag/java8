package com.java8.mylearning.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class EmployeeDatabase {
	
	 public static Supplier<Employee> employeeSupplier = () -> {
	        return  new Employee(1, "Sandip", 40, 600000l, "Male",10,Arrays.asList("Java","Spring","Sql","Microservices"));
	    };

	
	public static List<Employee> getEmployees() {
		
		Employee emp1 = new Employee(1, "Sandip", 40, 600000l, "Male",10,Arrays.asList("Java","Spring","Sql","Microservices"));
		Employee emp2 = new Employee(2, "Sachin", 35, 1000l, "Male",20,Arrays.asList("Java","Spring","Sql"));
		Employee emp3 = new Employee(3, "Saurabh", 25, 2000l, "Male",30,Arrays.asList("Sql","Mainframe"));
		Employee emp4 = new Employee(4, "Kamalakshi", 30, 40000l, "Female",10,Arrays.asList("Sql","Mainframe"));
		
		Employee emp5 = new Employee(5, "Ann", 37, 45000l, "Female",20,Arrays.asList(".Net","C,C++"));
		Employee emp6 = new Employee(6, "Geeta", 37, 60000l, "Female",30,Arrays.asList("Sql","Angular","Java Script"));
		Employee emp7 = new Employee(7, "Rahul", 39, 50000l, "Male",40,Arrays.asList("React","Java Script","Node.js"));
		Employee emp8 = new Employee(8, "James", 29, 400000l, "Male",40,Arrays.asList(".Net","C,C++"));
		
		Employee emp9 = new Employee(9, "Dwayne", 53, 420000l, "Male",10,Arrays.asList("Java","Spring","Sql","Microservices"));
		Employee emp10 = new Employee(10, "Alex", 59, 600000l, "Male",10,Arrays.asList("Sql","Angular","Java Script"));
		
		List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
		
		return empList;
		
	}

}
