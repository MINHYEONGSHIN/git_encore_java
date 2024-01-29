
public class EncoreMain {
	// byte -> short -> int -> long -> float -> double (묵시적 형변환)
	//		   char  ->
	
	// byte <- short <- int <- long <- float <- double (명시적 형변환)
	// 명시적 형변환(casting)
	public static void main(String[] args) {
		System.out.println("이붕이와 함께하는 즐거운 java"); // 표준출력장치를 통한 출력
		
		/*
		 *  지역변수는 메서드 내에 선언하는 변수
		 *  main은 method 내에 선언하는 지역변수이다 
		 *  지역변수 선언 시에는 접근제어자가 빠진다 method의 영향을 받기 떄문 
		 */ 
		int 	intValue =  10  ;
		char	charValue = 'M' ; // '은 문자 1개 "은 문자열(문자 여러개)
		double  doubleValue = 3.14 ;
		String stringValue = "밍옥이" ; // String은 첫 문자 대문자 시작,
		boolean booleanValue = false ;
		float  doubleValue2 = 3.14f ; //자바에서 실수는 double이 기본, 뒤에다가 f붙이면 float 값  
		
		System.out.println("정수값   : " + intValue) ; // +가 연결연산자 역할 하여 두 타입 중 더 큰 타입으로 변환됨
		System.out.println("문자값   : " + charValue) ; // +가 연결연산자 역할 하여 두 타입 중 더 큰 타입으로 변환됨
		System.out.println("실수값   : " + doubleValue) ; // +가 연결연산자 역할 하여 두 타입 중 더 큰 타입으로 변환됨
		System.out.println("문자열값  : " + stringValue) ; // +가 연결연산자 역할 하여 두 타입 중 더 큰 타입으로 변환됨
		System.out.println("논리값   : " + booleanValue) ; // +가 연결연산자 역할 하여 두 타입 중 더 큰 타입으로 변환됨
	} 

}


// complier와 interperter 가능, 
// 저장하는 순간 complie된다