import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

/*
 * List 계열의 자료구조는 순서가 있고(내부적으로 인덱스를 0부터 관리 ), 중복 허용한다. 객체를(Object 상속받는 타입) 담으며, 동적이다.
 * set 계열의 자료구조는 순서가 없고 중복허용 x 객체를(Object 상속받는 타입) 담으며, 동적이다.
 */

public class ListDemoMain {

	public static void main(String[] args) {
		
//		List<Person> col01 = new ArrayList(); // <> 내에 객체 타입 지정한다 col01의 타입은 iterable collection 다 가능(다형성) list는 안됨 인터페이스라서
		List<Person> col01 = new Vector();
//		col01.add("A");
//		col01.add("A");
//		col01.add(1); // generic 문법을 적용하면 타입의 안정성 체크로 에러가 뜸
		
		col01.add(new StudentDTO());
		col01.add(new StudentDTO());
		col01.add(new TeacherDTO()); //StudentDTO 시 타입 안맞아서 오류 Person 시 오류x
		
		System.out.println("배열의 길이는 length, 자료구조는 size() :" + col01.size());
		System.out.println("데이터를 가져온다면 : " + col01.get(0) + "\t" + col01.get(1)); // method의 return type은 object, 부모 타입은 자식에 접근x
		System.out.println("제너릭스 문법을 적용하지 않았을 때, 반환되는 타입은 Object");
		System.out.println("런 타임 시점에 객체에 접근하기 위해서는 캐스팅이 필요");
		System.out.println("데이터를 가져온다면 : " + ((StudentDTO)col01.get(0)).personInfo()); // 꺼낼때 타입맞춰서 꺼내야 함.
		System.out.println("데이터를 가져온다면 :" + col01.get(0).personInfo()); //<StudentDTO> generics 문법을 써주면 불필요한 down casting 필요없다.
		System.out.println("데이터를 가져온다면 : " + col01.get(2).personInfo()); // StudentDTO, EmployeeDTO TeacherDTO 시 각각에 해당하는 personInfo가 호출된다
		
		List<String> col02 = new LinkedList(); // 중간 요소 삽입 시 안정성이 높다(Arraylist보다)
		col02.add("B");
		col02.add("C");
		col02.add("D");
		System.out.println(col02.get(1));
		
		Collection col03 = new HashSet();
		col03.add("C");
//		col03.add("C");	확인
		
		

	}

}
