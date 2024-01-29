import com.encore.car.Car; // package 이름은 소문자 

public class CarMain {
	
	public static void main(String[] args) {
		
		Car car = new Car("DIGEL");
		
		// Car 객체 생성 후 인스턴스 소유의 메서드 호출
		car.engineInfo();
		
	}
}
