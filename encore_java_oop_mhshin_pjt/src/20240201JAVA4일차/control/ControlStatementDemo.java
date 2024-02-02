/*
 * 제어구문(if, switch)
 * if(논리값 | 논리식)
 * - 논리값을 가지고 조건판단
 * 
 * 
 * - 비교할 변수에 들어갈 타입(byte, short, char, int, String, enum)
 * - 혹시, 실수값, 논리값, 대소비교가 가능합니까? 안된다
 *  
 * - switch(비교할 변수) {
 * 		case 비교할 값 :
 * 			statement ;
 * 			break ;
 * 		case 비교할 값 :
 * 			statement ;
 * 			break ;
 * 		:
 * 		:
 * 		default : -- 조건에 만족하는 case가 없을 때 수행하는 영역
 * 			statement
 * }
 */


package com.encore.control;

import java.util.Scanner;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ControlStatementDemo {
	
	/*
	 * if 조건식
	 *  A 또는 B라는 값을 기대할 수 있다.
	 *  조건식에 대한 값이 true이면 if문 안의 내용을 실행하고 false이면 else문 안의 내용을 수행
	 *  
	 */
	/*
	 메뉴구성(1. 금도끼 2. 은도끼 3. 쇠도끼)
	 조건1) 입력숫자는 1~3 사이
	 조건2) 1번 선택시 '구라핑 ㄴ 도끼 없음'
	 조건3) 2번 선택시 ' 또 구라핑 ㄴ 도끼 없음'
	 조건4) 3번 선택시 '정직하구나 너에게 모든 도끼를 주겠다'
	 조건5) 조건 판단이 끝나면 산신령은 연못으로 사라진다. 
	*/ 
	public String woodMan() {
		
		String msg = null ; // 1.리턴타입 맞춰 변수 생성 , 지역변수는 메서드 내에서 사용가능하다
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1~3 사이 숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		if(1<=number && number <= 3) {
			// 지역변수를 블럭 안에 쓰면 의미 없음 
			if(number ==1 ) {
				msg = "구라핑 ㄴ 도끼 없음";
			}else if(number == 2) {
				msg = "또 구라핑 ㄴ 도끼 없음";
			}else {
				msg = "정직하구나 너에게 모든 도끼를 주겠다";
			}
		}else {
			System.out.println("정해진 숫자만 입력하세요");
		}
		System.out.println("산신령은 연못으로 사라진다 ");
		
		return msg ; // return 만나면 method는 끝나버린다, 2. retrun 변수 설정  이후 내부 로직 코딩 
	}
	
	/*
		메소드명 : public void example01(){}
		구현 내용 :
		            국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
		            각 점수를 키보드로 입력받고,
		            합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
		            세 과목의 점수와 평균을 가지고 합격 여부 처리함
		<합격의 조건 >
		세 과목의 점수가 각각 40점이상이면서,
		평균이 60점 이상이면 합격,
		아니면 불합격 처리함
	 */
	public void example01() {
		/*
		 * int kor = 0, eng = 0, math = 0, sum = 0;
		 * double avg = 0.0 ;
		 * 
		 * Scanner scan = new Scanner(System.in) ;
		 * System.out.print("국어점수를 입력하세요 : " );
		 * kor = scan.nextInt() ;
		 * System.out.print("영어점수를 입력하세요 : " );
		 * eng = scan.nextInt() ;
		 * System.out.print("수학점수를 입력하세요 : " );
		 * math = scan.nextInt() ;
		 * sum = kor + eng + math ;
		 * avg = sum / 3.0 ;
		 * 
		 * if(avg >= 60 && kor > 40 && eng >= 40 && math >= 40) {
		 * 		System.out.print("합격");
		 * }else {
		 * 		if(avg < 60) {
		 * 			System.out.print("평균점수미달로 불합격" );
		 * 		if(kor < 40) {
		 * 			System.out.print("국어점수미달로 불합격" );
		 * 		if(eng < 40) {
		 * 			System.out.print("영어점수미달로 불합격" );
		 * 		if(math < 60) {
		 * 			System.out.print("수학점수미달로 불합격" );
		 * }
		 * }
		 */
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("국어 점수를 입력하세요 : ");
		int kor_scr = scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int math_scr = scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng_scr = scan.nextInt();
		
		int total_scr = kor_scr + math_scr + eng_scr ;
		double avg_scr = total_scr / 3.0 ;
		
		if(kor_scr >= 40 && math_scr >= 40 && eng_scr >= 40) {
			if(avg_scr >= 60) {
				System.out.println("합격 이끼마스~");
			} else {
				System.out.println("야레야레 불합격 쟌넨");
			}
		} else {
			System.out.println("야레야레 불합격 쟌넨");
		}
	}
	
	public double calc(int x, char oper , int y) {
		// case 기본 if, 삼항연산자, switch ~ case
		double value = 0.0 ;
		
		switch(oper) {
			case '+' :
				value = x+y ;
				System.out.println("+");
				break ;
			case '-' :
				value = x-y ;
				System.out.println("-");
				break ;
			case '*' :
				value = x*y ;
				System.out.println("*");
				break ;
			case '/' :
				value = x/y ;
				System.out.println("/");
				break ;
				
			default : 
				System.out.println("사칙 연산자만 허용합니다");
				// default에는 break 안준다
		
		}
		
		return value ;
	}
}
