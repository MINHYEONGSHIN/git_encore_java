import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

public class RefAryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열이란?(Collection)
		 * -객체로 취급된다. [] 첨자번지는 0부터 시작, length, 고정길이, sameType만 담는다.
		 * -배열에 담을 수 있는 요소의 타입(기본, 참조)
		 * int [] ary ; // 선언 : int 타입을 받는 배열 변수선언(참조타입)
		 * int [10] ary  ; // 선언되는 시점에 길이 고정은 안됨 
		 * ary = new int[10] // 배열 생성(10개의 방을 가지는)
		 * String [] ary = {}; // 요소의 개수만큼 방이 생성됨
		 * String [] ary = new String[10]{} // 오류. 방이 생성되는데 거기다가 다시 방 개수를 지정해서
		 *  
		 */
		
		// 학생 객체 30명을 만들어서 관리하고 싶다면? 
		// EmployeeDTO emp01, emp02, emp03 ... emp30 ;
		
		// ctrl + shift + 0 -- import

		int idx =0; // 베열객체 생성. 인스턴스 아님
		StudentDTO [] empAry = new StudentDTO [30];
		empAry[idx++] = new StudentDTO("신민형", 20, "인천", "2014");
//		empAry[idx++] = new StudentDTO("이붕이", 20, "인천", "2014"); 
//		empAry[idx++] = new EmployeetDTO("이붕이", 20, "인천", "2014"); error  상수나 문자열, 다른타입의 객체 못담는다 StudentDTO 타입의 객체만 담으려고 만든 배열임
		
		//만약, 학생 강사 직원 객체를 담는 배열을 사용하고자 한다면?
		//우리는 3개의 배열을 만들어야 한다. 
		//변수의 다형성이 적용된다면? - 1개 배열만 있어도 됨
		
		Person  stu = new StudentDTO(); //Student 객체 생성, Person으로 담을 수 있다. 큰 타입이 작은 타입을 커버 할 수 있음
//		stu.setStuID("2000"); -- error 부모타입은 자식에 접근 불가
//		((StudentDTO)stu).setStuId("2000"); // 캐스팅을 통한 자식의 구성요소에 접근
		
		
		Person emp = new EmployeeDTO();
		Person tea = new TeacherDTO();
		
		//타입의 다형성을 배열에 적용한다면?
		
		int perIdx = 0;
		Person [] perAry = new Person[10];
		perAry[idx++] = new StudentDTO("신민형", 20, "부평구", "2014");
		perAry[idx++] = new TeacherDTO("신민형", 20, "부평구", "Logistcis");
		perAry[idx++] = new EmployeeDTO("신민형", 20, "부평구", "동반성장");
//		부모타입인 person을 담는 배열이지만 자식 담을 수 있다
		System.out.println("");
		Person per = perAry[perIdx];
//		if (per instanceof StudentDTO) {
//			StudentDTO obj = (StudentDTO) per;
//			System.out.println(obj.studentInfo());
//		}
//		
//		if (per instanceof TeacherDTO) {
//			TeacherDTO obj = (TeacherDTO) per;
//			System.out.println(obj.teacherInfo());
//		}	
//		if (per instanceof EmployeeDTO) {
//			EmployeeDTO obj = (EmployeeDTO) per;
//			System.out.println(obj.employeeInfo());
//		}
			

			System.out.println(per.personInfo());
	}
}
	


