package com.encore.vending;

import java.util.Scanner;

import lombok.AllArgsConstructor; //멤버변수가 가지고 있는 모든 것을 인자로 받는 special constructor를 생성
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor
@RequiredArgsConstructor // @NonNull이랑 붙어다님
public class VendingMachine {
	public static final int COLA		= 800 ;
	public static final int WATER		= 500 ;
	public static final int VITAWATER	= 800 ;
	
	@NonNull // 아래 인자를 받는 생성자 생성 
	private String type ;
	//
	private int	   money, number ;
	
	public void init() {
		switch(type) {
			case "if"	:
				ifVending();
				break;
			case "switch"	:
				switchVending();
				break;
		}
		//type.equals("if") ? ifVending() : switchVending() ; //삼항연산자 , 문자열은 ==가 아닌 equals.()으로 비교
														      // 삼항연산자 연산이 가장 빠르다 
		
	}
	
	private void menu() {
		Scanner scan = new Scanner(System.in);
		// 금액 입력
		System.out.println("금액을 입력하세요 : ");
		money = scan.nextInt();
		// 메뉴 입력 
		System.out.println("메뉴를 고르세요");
		System.out.println("1. 콜라(800) 2.생수(500) 3.비타민워터(1500) >> ");
		number = scan.nextInt(); // 지역변수는 다른 메서드에서 못 쓴다  전역변수 선언 필요 
	}
	
	private void ifVending() { //같은 클래스 내에서는 private이라도 접근 가능 
		System.out.println(">>>> if 구현");
		menu();
		if (number == 1 && money >= COLA) {
			money-= COLA ; // money = money - COLA ;
		}else if(number == 2 && money >= WATER) {
			money -= WATER ;
		}else if(number == 3 && money >= VITAWATER){
			money -= VITAWATER ;
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("잔돈 : "+money+"원");
		// %d, %f, %s
		System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개" , 
				(money/1000) , 
				((money%1000)/500), 
				(((money%1000)%500)/100));	
		
	}
	private void switchVending() {
		System.out.println(">>>> switch 구현");
		menu();
		int price = 0;
		switch(number) {
			case 1 :
				price = COLA ;
				break ;
			case 2 :
				price = WATER ;
				break ;
			case 3 :
				price = VITAWATER ;
				break ;
		}
		if(money < price) {
			System.out.println("잔액이 부족합니다.");
		}else {
			money -= price ;
		}
		System.out.println("잔돈 : "+money+"원");
		// %d, %f, %s
		System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개" , 
				(money/1000) , 
				((money%1000)/500), 
				(((money%1000)%500)/100));	
		
	}
}
