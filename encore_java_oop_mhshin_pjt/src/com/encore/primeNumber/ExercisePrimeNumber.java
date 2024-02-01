package com.encore.primeNumber;

import java.util.Scanner;

public class ExercisePrimeNumber {
	// 기본생성자 자동 생성됨
	
	// scanner 이용해서 사용자 값을 입력받아서전달 
	public static int getUserInput() {
		int result = 0 ;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		result = scan.nextInt();

		
		return result ;
	}

}
