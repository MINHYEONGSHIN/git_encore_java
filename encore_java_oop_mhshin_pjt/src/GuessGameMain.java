import java.util.Random;

import com.encore.guessgame.GuessGame;

public class GuessGameMain {

	public static void main(String[] args) {
		
		
		Random rand = new Random() ;
		int hiddenNumber = rand.nextInt(100) +1;
		
		int cnt = 0 ;
		
		boolean isFlag = false ;
		
		System.out.println("*********************************");
		System.out.println("1에서 100사이의 숫자를 맞춰보세요.");
		System.out.println("10번의 기회가 있습니다.");
		System.out.println("*********************************");
		
		while(cnt <= 10 && !isFlag) {
			++cnt;
			System.out.print(cnt+"번째 기회입니다. 숫자를 입력하세요");
			int inputNumber = GuessGame.getUserInput();
			
			if(inputNumber < 1 || inputNumber > 100) {
				System.out.println("1~100 사이의 값을 입력하세요");
			} else {
				if(inputNumber > hiddenNumber) {
					System.out.println(inputNumber+"보다 작습니다");
				} else if(inputNumber < hiddenNumber){
					System.out.println(inputNumber+"보다 큽니다");
				} else {
					isFlag = true ;
				}
			}
		}
		if (isFlag) {
			System.out.println("축하합니다."+(cnt)+"번 만에 맞추셨네요.");
		} else {
			System.out.println("10번의 기회가 끝났습니다. 다시 한번 시도해 보세요.");
		}
	}

}
