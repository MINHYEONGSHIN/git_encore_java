package com.encore.car.engine;

public class Engine {

	private String engineType ; // string : 참조타입이지만 기본타입처럼 사용 가능 , (멤버변수 전역변수)
	
	// 생성자 또는 메서드는 매개변수의 타입과 개수를 달리해서 재정의 할 수 있다 
	// 생성자 오버로딩, 메서드 오버로딩 
	// 생성자는 매개별로 받은 값을 전역(멤버)변수에 할당하는 역할을 한다. 초기화도 가능
	public Engine() { // 원래 생성자는 묵시적 생성이라 이렇게 일일이 선언할  필요 없음, new 연산자 뒤에서만 호출된다 	
	}
	
	public Engine(String engineType) {
		this.engineType = engineType ; // (지역변수) 멤버와 지역변수가 같으면 지역변수가 우선순위를 가진다 this -> 멤버변수 표시
	}

	
	public String showInfo() {
		return  "엔진의 타입은 " + engineType+" 입니다."; // 멤버변수는 클래스 전역에서 사용가능
		
	}
}

// 멤버변수와 지역변수가 이름이 같을 떄 지역변수가 우선순위를 가진다 
