import java.util.Random;

public class AryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 참조타입의 배열 선언으로 사요ㅕㅇ하기 위해서는 객체 생성이 필요하다
		// 선언과 동시에 객체 생성 완료!
		// 배열이라는 객체 생성, 담을 수 잇는 타입은 int, ary객체가 heap 주소값 가지고 있다
		// 0번부터 9번방까지 생성됨
		// [] ary : 배열 선언 
		int [] ary = null ;
		
		// 어디선가 객체 생성이 이루어져야 한다 
		
		ary = new int [10];
		
		int [] ary1 = new int [6] ;
		
		System.out.println("배열의 길이 - " + ary1.length);
		
		Random random = new Random();
		
		for(int idx = 0 ; idx < ary1.length ; idx ++) {
			ary1[idx] = random.nextInt(44) + 1;
		}
		System.out.println(">>> enhanced loop <<<"); //강화된 loop
		for(int data : ary1) {
			System.out.print(data+"\t");
		}
		
	}

}
