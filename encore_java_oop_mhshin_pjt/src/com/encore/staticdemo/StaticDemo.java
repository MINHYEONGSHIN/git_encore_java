package com.encore.staticdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // argument없는 생성자 
@AllArgsConstructor // 기본, 스페셜, setter getter 전부다 만들기 

public class StaticDemo {
	

	// 전역(인스턴스, 클래스)
	// 인스턴스 소유
	private String name ;
	
	// 클래스 소유 : 이렇게는 잘 안쓴다
	public static String staticMsg ;
	
	// 보통 이렇게 쓴다 static final -> 상수, 상수는 선언과 동시에 초기화되어야 함 초기화는 값 할당해주는 것
	// 상수는 full name 모두 대문자로 쓴다 
	public static final String URL = "나는 상수 입니다";
	 
	
	public void nonStatic() {
		System.out.println("나는 인스턴스 소유의 메서드입니다.");
		staticMsg = "jslim" ; // 인스턴스 소유 메서드에서 static 변수 및 메서드 사용이 가능하다
	}
	
	// static은 non static은 변수 접근 불가능. non static은 인스턴스 생성이 선행되어야 하기 때문 
	public static void staticMethod() {
		System.out.println("나는 클래스 소유의 메서드입니다 ");
		// name = "encore" ; -error static 영역에서 인스턴스 소유의 변수를 사용할 수 없다. static이 먼저 올라가고 그다음 인스턴스가 hip에 올라오므로
	}
	
	
}

