
public class StringDemoMain {

	public static void main(String[] arg) { // main은 static을 필요로한다 JDM -> Static -> main
		// 자바에서 참조타입이지만 기본타입처럼 사용가능한 유일한 변수의 타입은 String
		// string은 인스턴스 생성없이 사용가능하지만 객체로 취급이 된다.
		//	String str01 = "이붕이";
		//	String str02 = "이붕이02";
		String str01 = new String( "이붕이"); // 값은 같지만 주소가 다르다 
		String str02 = new String("이붕이");
	
	if (str01 == str02) {	// 주소값을 비교하는 식임. 같은 값을 가지고 있어도 다르다고 나온다 
		System.out.println("주소값이 동일합니다.");
	}else {
		System.out.println("주소값이 동일하지 않습니다.");
	}
	
	if (str01.equals(str02)) { // 값을 비교하는 식
		System.out.println("값이 동일합니다");
	}else {
		System.out.println("값이 동일하지 않습니다");
	}
	
	}
}

// string은 참조타입이지만 기본타입처럼 사용가능 
// 값 비교시에는 equals 메서드 사용해야 한다 ==는 주소값 비교임