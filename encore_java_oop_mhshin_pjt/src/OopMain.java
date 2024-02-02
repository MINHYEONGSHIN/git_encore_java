import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;

public class OopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StudentDTO	stu01 = new StudentDTO() ; // 변수선언 + 생성자 호출, 메모리에 인스턴스 만들어짐. 그 안에 DTO의 변수 담김.
	
	
	
	// 참조변수 + 변수명 = 주소값
	
	/* 접근지정자가 private이면 접근 불가
	System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 -> " + stu01.name);
	System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 -> " + stu01.age);
	System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 -> " + stu01.address);
	System.out.println("인스턴스 소유의 변수에 접근하여 값을 가져온다 -> " + stu01.stuID);
	*/
	
	
	// setter , getter 접근
	System.out.println("인스턴스 소유의 메서드에 접근 ->" + stu01.getName()); // 값을 지정하지 않았으므로 null값 반환
	stu01.setName("이붕이");
	System.out.println("인스턴스 소유의 메서드에 접근 ->" + stu01.getName());
	
	// 스페셜 생성자 호출을 통한 객체 생성
	System.out.println();
	System.out.println("스페셜생성자 생성 ");
	
	StudentDTO stu02 = new StudentDTO("MOY", 27, "청원구", "2017") ;
	
	System.out.println(stu02);
	
	System.out.println("인스턴스 소유의 메서드에 접근 ->" + stu02.getName());
	System.out.println("인스턴스 소유의 메서드에 접근 ->" + stu02.getAge());
	System.out.println("인스턴스 소유의 메서드에 접근 ->" + stu02.getAddress());
	System.out.println("인스턴스 소유의 메서드에 접근 ->" + stu02.getStuID());
	
	// 나이 변경
	stu02.setAge(-100);
	System.out.println("인스턴스 소유의 메서드에 접근 ->" + stu02.getAge());
	
	// 강사객체 생성 후 정보 확인
	System.out.println();
	System.out.println("강사객체 생성 후 정보 확인 ");
	TeacherDTO tcr01 = new TeacherDTO("이붕이", 30, "부평구", "OOP");
	System.out.println(tcr01);
	
	
	// 직원객체 생성 후 정보 확인 
	System.out.println();
	System.out.println("직원객체 생성 후 정보 확인 ");
	EmployeeDTO emp01 = new EmployeeDTO("신민형", 30 , "흥덕구", "CPO)동반성장");
	System.out.println("직원 객체 생성 -" + emp01);
	
	}

}
