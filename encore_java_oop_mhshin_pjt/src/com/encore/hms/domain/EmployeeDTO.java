package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class EmployeeDTO extends Person{
//	private String name ;
//	private int	   age  ;
//	private String address ;
	private String dept ;
	public EmployeeDTO() {
		super();
	}
	
	public EmployeeDTO(String name, int age, String address, String dept) {
		super(name, age, address);
//		this.name = name;
//		this.age = age;
//		this.address = address;
		this.dept = dept;
	}
	
	
	
	
	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	
	public String employeeInfo() {
//		return "EmployeeDTO [name=" + name + ", age=" + age + ", address=" + address + ", dept=" + dept + "]";
		return super.personInfo() + ", deptID= "+ this.getDept();
	}
	
	@Override // override 체크 시 활용 가능 
	public String personInfo() {
		return super.personInfo() + ",  dept =" + dept ;
	}
	
}