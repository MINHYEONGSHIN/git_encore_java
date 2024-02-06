package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class StudentDTO extends Person {
	
//	private String name ;
//	private int    age  ;
//	private String address ;
	/////////////////////////
	
	//자기 자신만의 고유한 요소
	private String stuId ;
		//super
	
	
	
	//기본생정자 default
	// 명시적 기본생성자 생성, return type없고 클래스이름과 동일
	public StudentDTO() {
		super() ; // 부모객체 생성 없어도 묵시적으로 생성됨
	}
	public StudentDTO(String name, int age, String address, String stuID) { // 생성자 추가생성 source - generate ..usingfield,
		// 데이터를 가진채로 인스턴스 생성, SET 필요없음 
		super(name, age, address); // 부모의 기본 생성자 호출(객체 생성), 명시적으로 쓸 경우 생성자 최상단에 작성 이걸로 부모의 메서드에 접근가능
//		super.setName(name); // 부모의 메서드로 부모에게 값 할당, this도 가능하지만 가독성을 위해 super로 둔다 
//		super.setAge(age); // 부모의 메서드로 부모에게 값 할당 
//		super.setAddress(address);  // 부모의 메서드로 부모에게 값 할당 
		this.stuId = stuId; // 이건 나에게 직접 할당 
		
		
//		this.name = name;
//		this.age = age;
//		this.address = address;
		
	}


	// 멤버변수와 지역변수가 이름이 같으면 지역내에서는 지역변수가 우위.
	// 따라서 인스턴스한테 줄 변수들이르몰 인스턴스 꺼라고 this로 표시하는 것
//	public String getName() {
//		return name;
//	}
//
//
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//
//
//	public int getAge() {
//		return age;
//	}
//
//
//
//
//	public void setAge(int age) {
//		if(age < 0) {						//악의적인 데이터 변경 방지 
//			System.out.println("구라핑 ㄴㄴ");
//		}else {
//			this.age = age;
//		}
//	}
//
//
//
//
//	public String getAddress() {
//		return address;
//	}
//
//
//
//
//	public void setAddress(String address) {
//		this.address = address;
//	}




	public String getStuId() {
		return stuId;
	}




	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
	
	public String studentInfo() {
		// return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", stuID=" + this.stuID ;
		return super.personInfo() + ", stuID=" + this.getStuId() ;
	}

	// overridding(상속관계에서 부모의 메서드를 자식에서 재정의하는 것) 구현부만 달라진다 
	// overridding(인자 빼고 다 똑같음) 
	// overridding 조건 : 접근지정자 반환타입 메서드명 매개변수 타입과 개수가 일치

	@Override // override 체크 시 활용 가능 
	public String personInfo() {
		return super.personInfo() + ",  stuID =" + stuId ;
	}


}
