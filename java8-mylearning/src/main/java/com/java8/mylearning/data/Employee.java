package com.java8.mylearning.data;

import java.util.List;

public class Employee {
	
	private Integer id;
	private String name;
	private Integer age;
	private Long salary;
	private String gender;
	private Integer dept;
	private List<String> skills;
	
	public Employee() {
		
	}
	public Employee(String name) {
		this.name = name;
	}
	public Employee(Integer id, String name, Integer age, Long salary, String gender,Integer dept, List<String> skills) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.dept = dept;
		this.skills = skills;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Integer getDept() {
		return dept;
	}
	
	public void setDept(Integer dept) {
		this.dept = dept;
	}


	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
				+ ", dept=" + dept + ", skills=" + skills + "]";
	}


}
