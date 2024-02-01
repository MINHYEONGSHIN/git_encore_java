package com.encore.car;

import com.encore.car.engine.Engine;

public class Car {
	
	// 전역(멤버)변수 스코프는 클래스 전역에서 사용가능한 변수 
	private Engine engine ;
	
	// 기본 생성자 정의 해보자 
	// 생성자는 like a method 로 반환타입이 정의되지 않고 메서드의 이름은 클래스의 이름과 동일
	public Car() {
		engine = new Engine() ;
	}
	public Car(String type) {
		engine = new Engine(type) ;
		
	}
	
	public void engineInfo() { // VOID는 반환을 내부적으로 처리한다
		String info = engine.showInfo() ;
		System.out.println(">>>>엔진정보<<<<");
		System.out.println(info);
	}
	
}
