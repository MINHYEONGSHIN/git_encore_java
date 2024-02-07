package com.encore.grade.entity;

public class Employee {
	
	private String name ;
	private String emp_no ;
	private int	   age ;
	
	public Employee (String name, String emp_no, int age) {
		this.name = name;
		this.emp_no=emp_no;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
