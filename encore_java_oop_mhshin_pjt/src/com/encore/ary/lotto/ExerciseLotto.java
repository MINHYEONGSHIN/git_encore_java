package com.encore.ary.lotto;

import java.util.Random;

// 로또번호를 생성하고 생성된 번호를 배열에 담아서 관리하고 출력하는 역할 
public class ExerciseLotto {
	

	
	public ExerciseLotto() {
		
	}
	
	// 로또번호 생성 후 반환
	// 중복x
	public int [] generateLottoNumbers() {
		Random random = new Random();
		int [] lottoAry = new int [6] ;
		
		for(int i = 0 ; i < lottoAry.length ; i++) {
			lottoAry[i] = random.nextInt(44)+1 ;
			for(int j = 0 ; j < i ; j++) {
//				if ( lottoAry[i] == lottoAry[j]) {
//					lottoAry[i] = random.nextInt(44)+1 ;
//				}
				
//				if(lottoAry[j] == lottoAry[i]) {
//					i--;
//					break;
//				}
				
				while(lottoAry[i] == lottoAry[j]) {
					lottoAry[i] = random.nextInt(44)+1 ;
				}
			}
 		}
		
		return lottoAry;
	}
	
	// 매개변수로 배열을 입력받아서 출력
	public void displayLottoNumbers(int [] lottoNumbers) {
		
		
		for(int idx = 0 ; idx < lottoNumbers.length ; idx++) {
			System.out.println(lottoNumbers[idx]+" ");
		}
	}
	
	// 로또 번호를 오름차순으로 정렬하는 역할
//	private void sortLottoNumbers(int [] lottoNumbers) {
//		
//	}
}
