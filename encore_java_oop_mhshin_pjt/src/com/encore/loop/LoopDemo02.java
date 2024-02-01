package com.encore.loop;

import java.util.Scanner;

/*
 * 초기값:
 * while(조건식) {
 * 	statement ;
 * 	[증감식 or 분기문]
 * 
 * }
 * 증감식값이 없으면 무한루프
 * 필요에 따라서 while(true) 무한 반복을 유도
 * 
 * 초기값
 * do{
 * 		statement;
 * 		[증감식 or 분기문]
 * } while(조건식);
 * 
 * while(true) 		 - 무한루프
 * do ~ while(false) - 한번 수행하고  
 */

public class LoopDemo02 {
	
	//default constructor
	public LoopDemo02() {  
		
	}

	// 1~난수(100)까지의 합을 구해보고 싶다
	public void sumRandom() {
		int nan = (int)(Math.random()*100 + 1) ; //static이므로 별도의 객체생성없이 가져 올 수 있다. import도 필요 없음 
		System.out.println("nan :"+nan);
		
		int sum = 0 ;
		for(int idx = 1 ; idx <= nan ; idx++) { //블럭 안에서 선언된 변수는 지역변수. 외부에서 참조가 안됨
			sum += idx;
		}
		System.out.println("sum = "+ sum);
	}
	
	// 난수 두 개를 발생시켜서 최소값부터 최대값까지의 합을 구하고 싶다면?
	public void sumRandomTwo() {
		int min = 0, max = 0, sum = 0;
		int first = (int)(Math.random()*100 +1);
		int second = (int)(Math.random()*100 +1);
		
		if(first > second) {
			max = first ;
			min = second ;
		} else {
			max = second ;
			min = first ;
		}
		
		for(int idx = min ; idx <= max ; idx++) {
			sum +=idx ;
		}
		System.out.println("sum ="+ sum);
		System.out.println(Math.max(first, second));
		System.out.println(Math.min(first, second));
	}
	
	// A~Z 출력하는 구문 
	public void charPrint(char start, char end) {
		for(char idx = start ; idx <= end ; idx++) { //char도 반복 가능 
			System.out.printf("%c \t" , idx);
		}
		
	}
	
	//1~100사이의 홀수의 합을 출력한다면?
	public void sumOdd() { //인자안받는다 = 데이터를 내부에서 다룬다
		int sum = 0;
		for(int idx = 1 ; idx <= 100 ; idx++) {
			if(idx%2 != 0) {
				sum += idx;
			}else {
				continue;
			}
		}
		System.out.println("sum ="+sum);
	}
	
	
	//1~난수(100)를 발생시켜서 짝수의 개수가 몇개인지 출력한다면?
	public void countEven() {
		int nan = (int)(Math.random()*100 + 1) ;
		int cnt = 0;
		for(int idx = 1 ; idx <= 100 ; idx++) {
			if (idx%2==0) {
				cnt+=1;
			} else {
				continue;
			}
		}
		System.out.printf("작수의 개수 : cnt"); //
	}
	
	
	// 매개변수로 문자열을 입력받아서 문자를 추출하여 출력하고 싶다면
	public void splitString(String str) {
		System.out.println("args -> "+ str);                 //참조이면서 기본타입처럼 쓸수있다. 객체임
		
		for(int idx = 0 ; idx <= str.length()-1 ; idx++) {
			System.out.print(str.charAt(idx)+"\t");
		}
	
	}
	
	// scanner를 이욯해서 값을 입력받은 후 1에서부터 차례로 누적해서 합을 구하다가 입력한 값을 넘으면 중단하고 
	// 마지막으로 더해진 값과 그 떄까지의 합을 출력하고 싶다면?
	// 입력예) 100
	// 출력예시) 20 104
	
	public void sumBreak_mine() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		int sum = 0, idx = 0;
		
		for( idx = 1 ; sum <= number ; idx++, sum+=idx ) {
		}
		System.out.println(idx);
		System.out.println(sum);

	}
	
	public void sumBreak_answer() {
		Scanner scan = new Scanner(System.in);
		System.out.print("데이터를 입력하세요 : ");
		int number = scan.nextInt();
		
		int idx = 0, sum = 0;
		
		for(idx = 1 ; ; idx++ ) {
			if(sum > number) {
				break;
			}
			sum += idx ;
		}		
		System.out.println(idx-1+"\t"+sum);

	}
	
	public void nestedFor_explanation() {
		for(int row = 1 ; row <= 10 ; row++) {
			System.out.println("row idx = " +row); //찍고 커서가 그대로 
			
			for(int col = 1 ; col <= 10 ; col++) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
	}
	
	public void nestedFor_asterisk() {
		for(int row = 1 ; row <= 10 ; row++) {
			for(int col = 1 ; col <= 10 ; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void gugudan() {
		for(int dan = 2 ; dan <= 9 ; dan++) {
			System.out.printf(">>>> %d 단<<<<" , dan);
			System.out.println();
			for(int number = 1 ; number <= 9 ; number++) {
				System.out.println(dan + "*" + number + "=" + (dan*number)+"\t");	
			}
			System.out.println();
		}
	}
	
	public void gugudanTable() {
		for(int dan = 2 ; dan <= 9 ; dan++) {
			System.out.printf(">>>> %d <<<<", dan);
			System.out.println();
			gugudanTimes(dan);
		}
	}
	
	private void gugudanTimes(int dan) {
		for(int number = 1 ; number <= 9 ; number++) {
			System.out.println(dan + "*" + number + "=" + (dan*number)+"\t");
		}
		System.out.println();
	}
	
	
	// i, j 변수만 출력(5 * 5)
	public void printIJ() {
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.println(j);
				//System.out.println("row = " + i + ", col = " + j);
			}
		}System.out.println();
	}
	
	/*
	 * 출력예시)
	 * 23456
	 * 34567
	 * 45678
	 * 56789
	 * 678910
	 */
	public void forLine() {
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.println(i+j);
			}
		}System.out.println();
	}
	
	// break, continue
	// break : 가장 가까운 루프구문을 빠져나근 것
	// continue : 조건에 만족할 경우 실행을 하지않고 다음 차례로 이동
	public void gugudan02() {
		for(int dan = 2 ; dan <= 9 ; dan++) {
			System.out.println();
			System.out.printf(">>>> %d 단<<<<" , dan);
			System.out.println();
			for(int number = 1 ; number <= 9 ; number++) {
				

				
				System.out.print(dan + "*" + number + "=" + (dan*number)+"\t");	
				
				if(number ==5) {
					break ;
				}

			System.out.println();
			}
		}
	}
	
	public void forLabel() {
		outer : 
		for(int i = 1 ; i <= 5 ; i++ ) {
			for( int j = 1 ; j <= 5 ; j++) {
				if(j == 3) {
					break outer ;
				}
				System.out.println("i, j = "+i+"\t"+j);
			}
		}
	}
	
	// while
	public void whileOneToTen() {
		int idx = 1 ;
		while(idx <= 10) {
			System.out.print(idx+"\t");
			
			idx++;
		}
	}
	
	//스캐너로부터 문자열을 입력받아서 for, while 구문으로 각 문자의 인덱스와 문자를 쌍으로 출력 
	public void printStrIdx() {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열를 입력하세요 : ");
		String str = scan.nextLine();
		
		System.out.println(">>>>for<<<<");
		for(int idx = 0 ; idx <= str.length()-1 ; idx ++) {
			System.out.printf(str.charAt(idx)+"\t",idx);
		}
		
		System.out.println(">>>>while<<<<");
		
		
	}
	
	public void doWhileTest() {
		System.out.println("do~while");
		do {
			System.out.println("false 이지만 한번은 무조건 수행!!");
		}while(false) ;
		
	}
	
}

