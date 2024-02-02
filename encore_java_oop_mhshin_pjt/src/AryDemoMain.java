import com.encroe.array.AryDemo;

public class AryDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AryDemo에서 구현된 메서드 호출하고 싶다면
//		AryDemo demo = new AryDemo();
//		int [] ary = demo.makeScores(); //swallow copy 얕은 복사 생성된 객체는 배열 하나. 양쪽에서 같은 걸 참조하는 것.
//		System.out.println("ary address : "+ary);
		
		//배열을 전달하여 총합과 평균을 출력하고 싶다.
//		demo.scorePrint(ary) ;
		
		/*
		System.out.println(">>> 랜덤 카드 게임 <<<");
		String [] shapes = {"spade", "clover", "heart", "diamond"} ; //초기화
		String [] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
	
		int shapeIdx = (int)(Math.random() * shapes.length) ;
		int numberIdx = (int)(Math.random() * shapes.length) ;
		
		System.out.println("뽑은 카드는 : " + shapes[shapeIdx] + " " + numbers[numberIdx] + "입니다");
		*/
		
		System.out.println("주민번호를 입력받아서 성별자리 이후부터 *로 가려서 출력하고 싶다면?");
		System.out.println("출력예시) 730910-*******");
		String ssn = "730910-1234567" ;
		
		char [] charAry = ssn.toCharArray();
		System.out.println("ary length : " + charAry.length);
		System.out.println("ary gender : " + charAry[7]);
		for(int idx = 0 ; idx < charAry.length;idx++) {
			if (idx > 7) {
				charAry[idx] = '*';
			}
		}
//		System.out.println("Result : " +charAry); // 주소값 반환 
		for(int idx = 0 ; idx < charAry.length;idx++) {
			System.out.print(charAry[idx]);
		}
	}

}
