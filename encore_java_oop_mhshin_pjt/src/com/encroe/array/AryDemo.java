package com.encroe.array;

import java.util.Scanner;

public class AryDemo {

	
	public AryDemo() {
		
	}
	
	// Scanner를 이용해서 5명 학생들의 국어점수만 입력받아 배열에 담아 반환한다면?
	public int[] makeScores() {
		int [] scoreAry = new int[5] ; // scoreAry는 주소값들어감
		System.out.println("ary address : "+scoreAry);
		Scanner scan = new Scanner(System.in) ;
		for (int idx = 0 ; idx < scoreAry.length ; idx++) {
			System.out.print(idx+1 + "번째 학생의 점수를 입력하세요 : ");
			scoreAry[idx] = scan.nextInt();
		}
		
		return scoreAry ;
	}
	
	public void scorePrint(int [] ary) {
		int sum = 0, avg = 0; 
		for(int idx = 0 ; idx < ary.length ; idx++) {
			sum += ary[idx];
		}
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (sum/ary.length));
	}
}
