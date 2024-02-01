

package com.encore.test;

/*
	// single line comment
	
	XXXXVO.java , XXXXDTO.java , XXXXEntity.java
	-- 업무로직이 없고 데이터만 관리하는 클래스로, 변수 및 Setter, Getter로 이루어져 있다, 데이터를 담고 반환해주는 역할
 */
public class StudentVO {  // vo : value object , dto : data tranfer object, 
	private String  name ; // 참조타입 선언 다만, 유일하게 참조타입이면서 기본처럼 쓰일 수 있는 타입이 문자열 타입.
	private int     age  ;
	private double  height ;
	private boolean isMarriage ;

	/*
	 *  변수(variable)
	 *  구문형식 : 접근지정자 변수타입 변수명 ;
	 *  -- 접근지정자(public, private)
	 *  -- 변수타입(기본타입, 참조타입)
	 *  -- 변수명(소문자로 시작해야한다 또는 $ _로 시작 가능 )
	 *  -- 자바 예약어는 변수명으로 사용 불가능 
	 *  -- 기본타입 3가지 정수(byte short int long) 실수(float double) 논리(boolean) 문자(char)
	 *  -- 위 8개가 아닌 것들은 참조타입
	 *  
	 *   변수란 선언 위치가 있는데 (전역, 지역)
	 */
	// class ->전역변수(클래스 내에서 접근가능한 범위를 갖는 것), class inside method outside
	// 변수 앞에 is 가 붙어있으면 논리형으로 약속함 
	// 메인이 없으면 COMPLIE만 된다 INTERPETE는 불가능 



	// voclass 내 변수들은 private으로 잠군다(외부접근불가 내부접근가능)  
	
	
	
	/*	
	    <클래스로 찍어내는 인스턴스>
	    
	    생성자(Constructor)
	    매개변수가 없는 생성자는 기본 생성자 
	    매개변수가 있는 생성자는 스페셜 생성자
	    명시적으로 생성자가 정의되지 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일을 진행   
	    구문형식)
	    접근지정자 클래스이름([매개변수]) {
	    
	    }
		
		메서드(함수) : caller에 의하여 호출이 이루어져있을 때 업무로직 수행(working method)
		구문형식) 
		반환타입이 void가 아니라면 문장이 끝나기 전에 return 키워드를 이용해서 값을 반환 
		
		접근지정자[public/private] 반환타입[int,double,void(리턴할 값이 없을 때)] 메서드이름([매개변수:지역변수]) {
			문장;
			return (기본값 | 참조값)
		}
		
		
	 */
	




// getter 는 인자 받지 않고 리턴만함 , setter는 인자 받음

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
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public boolean isMarriage() {
	return isMarriage;
}
public void setMarriage(boolean isMarriage) {
	this.isMarriage = isMarriage;
} 
}
// java에서는 보통 객체에 데이터를 담는다 
