import com.encore.primeNumber.ExercisePrimeNumber;

public class PrimeNumberMain {

	public static void main(String[] args) {
		
		int inputNumber = ExercisePrimeNumber.getUserInput();
		// 소수 판단하는 로직(for, if)
		// 0,1은 소수가 아니다 2 소수
		// 어떤 숫자가 소수가 되려면 11을 2부터 10(11보다 1 작은 숫자)까지 차례대로 나누어보고
		// 나머지가 0인 경우가 한번도 없으면 그 수는 소수이다
		// 즉, N보다 작은 자연수들로 나누는 방식
 	
		if(inputNumber < 2 ) {
			System.out.println(inputNumber+"은(는) 소수가 아닙니다.");
		} else if(inputNumber == 2) {
			System.out.println(inputNumber+"은(는) 소수입니다.");
			return; // 종료
		}
		boolean isFlag = true ;
		for(int idx = 2 ; idx < inputNumber ; idx++) {
			if( inputNumber % idx == 0) {// 만족하면 소수가 아니므로 
				isFlag = false ;
				break;
			}
		}
		String msg = (isFlag == true) ? inputNumber+"은(는) 소수입니다." : inputNumber+"은(는) 소수가 아닙니다.";
		System.out.println(msg);
	}

}
