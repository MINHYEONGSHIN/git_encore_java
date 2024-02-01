package com.encore.operator;

import java.util.Scanner;

public class OperatorDemo {
	
	public OperatorDemo() {
		
	}

	// example01 반환값 X, 매개변수 X
	public void example01() { // 메서드 리턴타입 없음
		System.out.println(">>> 산술연산");
		int x = 100, y = 100, result = 0;
		System.out.println("+" + (x + y));  //+100100
		System.out.println("-" + (x - y));
		System.out.println("*" + (x * y));
		System.out.println("/" + (x / y));
		System.out.println("%" + (x % y));
	}

	public String example02(String color01, String color02) { 
		System.out.println(">>> 연결연산");
		return "신호등의 색깔은" + color01 + "과" + color02 + "입니다";
	}
	
	public void example03() { 
		System.out.println(">>> 논리연산");
		boolean isFlag = false ;
		System.out.println("논리 부정," + !isFlag);
		
		// Scanner로부터 입력받은 숫자가 짝수인지 아닌지 
		Scanner scan = new Scanner(System.in) ;
		System.out.print("숫자입력 : ");
		int number = scan.nextInt();
		System.out.println("Result >>>> 짝수 "+ (number%2 == 0) );
		System.out.println("Result >>>> 홀수 "+ (number%2 != 0) );
		
		
		// Scanner로부터 입력받은 숫자가 3의 배수인지 아닌지를 판단하고 싶다면
		System.out.println("Result >>>> 3의 배수 "+ (number%3 == 0) );
		
	}
	
	public void example04() {
		System.out.println(">>>> 증감연산, ++, --");
		int age = 50 ;
		System.out.println("현재 나이는 = " + age);
		++age ; // age = age + 1
		System.out.println("현재 나이는 = " + age);
		System.out.println(age++); // print 후 age = age + 1
		System.out.println("현재 나이는 = " + age);
		
//		System.out.println();
//		int number = 20 ;
//		int result = number++*3;
//		System.out.println("Result >>>>" + result); // 60
		
		System.out.println();
		int number = 20 ;
		int result = ++number*3;
		System.out.println("Result >>>>" + result); // 63
	}
	
	
	public void example05() {
		System.out.println(">>>> 일반논리연산");
		/*
		 * &(이면서, 이고) , |(이거나) , (&&, ||) - short shortcut
		 */
		Scanner scan = new Scanner(System.in) ;
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		// Scanner 부터 입력받은 숫자가 1~100 사이인지 판단하고 싶다면?
		System.out.println("1~100" + (number >= 1 && number <= 100)); //&, && 차이? & 앞의 조건이 false여도 뒤 조건까지 체크, && 앞의 조건이 false이면 다음 조건 체크x
		
	
	}
	
	public void example06() {
		System.out.println(">>>> 일반논리연산");
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("문자를 입력하세요 : ");
		char str = scan.next().charAt(0);
		// next 공백없는 문자입력 nextline은 공백있는 문자열 next는 string으로 return함 
		// Scanner 부터 입력받은 문자가 A~Z 대문자인지 판단하고 싶다면?
		System.out.println("input char , " + (str));
		System.out.println("A~Z" + (str >= 'A' && str <= 'Z')); // 내부적으로 문자를 숫자로 받기때문에 크다 작다 비교 가능
	}
	
	
	public void example07() {
		System.out.println(">>>> 삼항연산");
		// (조건식) ? 참일 경우 : 거짓인 경우
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		// Scanner 부터 입력받은 숫자가 양수인지 음수인지 아니면 0인지 판단?
		// String result = (number > 0) ? "양수" : "음수" ;
		String result = (number > 0) ? "양수" : (number == 0) ? "0" : "음수" ;
		System.out.println("Result >>>>" + (result));
				
		
		
		}
}
// 지역변수는 선언과 동시에 초기화