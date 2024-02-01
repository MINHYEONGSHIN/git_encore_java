import java.util.Scanner;

import com.encore.control.ControlStatementDemo;
/*
 * 제어구문(if, switch)
 * 논리값을 가지고 조건판단
 */
public class ControlStatementMain {
	
	public static void main(String[] args) {
		// evenCheck();
		ControlStatementDemo demo = new ControlStatementDemo() ;
//		demo.woodMan();
//		demo.example01();
		
		// calc 메서드 호출시 사칙연산자 +,-,*,/
		double value = demo.calc(100, '*', 100) ; // ''은 java에서 char 
		System.out.println("result >>>>" + value);
	}
	
	public static void evenCheck() {
		// Scanner로부터 숫자 하나를 입력받아서 양수면서 짝수인지 아닌지를 판단하고 싶다면? - 짝수 또는 홀수
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		if(number > 0) {
			System.out.println("논리값이 참(true)일 때 수행하게 되는 영역");
			if(number % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else {
			System.out.println("논리값이 거짓(false)일 때 수행하게 되는 영역");
			System.out.println("양수를 넣지 않아 프로그램을 종료합니다");
			System.exit(0);
		}
	}
}
