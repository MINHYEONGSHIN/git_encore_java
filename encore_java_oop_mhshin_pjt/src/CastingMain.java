
public class CastingMain {

	public static void main(String[] args) {
		
		// 자바의 캐스팅 연산자 : (타입)변수명 ;
		
		byte x, y , sum ; // 선언 
		
		x = 10 ;
		y = 10 ;
		sum = (byte)(x + y) ; // 정수의 default는 int, byte+byte 는 묵시적 형변환으로 default 값(int) 된다
		
		System.out.println("sum = " + sum);
		System.out.println();
		System.out.println();
		
		char charValue   = 'A' ; 
		char charValue02 = 'B' ;
		
		System.out.println("char value = "+charValue);
		System.out.println(charValue + charValue02) ; // 문자열은 +연산안되므로 INT로 자동적으로 업캐스팅 된 것
		System.out.println((char)(charValue + charValue02)) ; //캐스팅
		System.out.println((char)(97)) ;
		
 	}

}
