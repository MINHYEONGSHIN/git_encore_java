import com.encore.test.StudentVO; // 관계를 맺을 수 있는 선언

public class ReferenceMain {
	/*
	 * 기본타입과 참조타입 차이점 
	 * 기본타입은 선언과 동시에 값을 할당할 수 있다
	 * 기본타입은 값을 담는 변수 
	 * 
	 * 그러나 
	 * 참조타입은 선언과 동시에 값을 할당할 수 없다
	 * 참조타입은 값을 담는 변수가 아니라 주소값을 담는다 즉 인스턴스가 먼저 생성되어야 한다 
	 * 주소값을 담기 위해서는 객체 생성이 선행되어야 한다  
	 * 객체 생성 시 사용하는 연산자는  new
	 * new 뒤에는 생성자(Constructor)호출
	 * 
	 * 참조타입 : 클래스, 배열, 자료구조, enum etc... / 객체생성이 선행되어야 인스턴스가 변수 , 메서드에 대한 접근이 가능하다
	 */
	public static void main(String[] args) {
		//StudentVO stuObj = 'A' ;  참조타입은 인스턴스 성성을 통한 주소가 필요하기 때문에 바로 변수를 담을 수 없다  
		//System.out.println( new StudentVO());
		StudentVO stuObj = new StudentVO(); // 생성된 인스턴스의 주소를 담는다 
		// 접근제어자가 public 일 떄 가능한 코드 
//		System.out.println("인스턴스 소유의 변수 호출 : " + stuObj.name);
//		stuObj.name = '포케';
//		System.out.println("인스턴스 소유의 변수 호출 : " + stuObj.name);
	
		
		System.out.println("인스턴스 소유의 메서드 호출 : ");
		stuObj.setName("MOJO"); // 메서드 호출
		String returnValue = stuObj.getName() ;
		System.out.println(returnValue);
		System.out.println(stuObj.getName());  // set,get 설정을 통해 데이터유효성과 클래스 안정성 확보 가능
	
	}
		
}
