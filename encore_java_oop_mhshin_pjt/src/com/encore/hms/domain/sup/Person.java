package com.encore.hms.domain.sup;



public class Person {
	
	// 자식들에게 물려줄 공통의 요소
	// 접근제어자가 private 이므로 자식이지만 접근을 허용하지 않는다
	// 단 protected로 열어주면 상속관계에서 자식에게 허용
	
	private String name ; 
	private int	   age  ;
	private String address ;
	
	public Person() {
		super();
	}

	public Person(String name, int age, String address) {
		super(); //기본생성자 호출  
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 만약 자식클래스에서 메서드를 오버라이딩하지 못하게 하고 싶다면? -> final
	public String personInfo() {
		return "name=" + name + ", age=" + age + ", address=" + address;
	}
	
	// 부모는 tostring 메서드 가지고 있음 
	
	
	
	
	
	
}
