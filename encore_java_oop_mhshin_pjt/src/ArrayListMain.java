import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

public class ArrayListMain {

	public static void main(String[] args) {
		
		/* Array : 고정길이, .length
		Number [] ary = new Number[5]; // static allocation 변수 생성과 동시에 선언
		ary[0] = 10; ary[1] = 20 ; ary[2] = 30; ary[3] = 40; 
		System.out.println("length : " + ary.length);
		ary[2] = null ; 
		System.out.println(Arrays.toString(ary));
		*/
		
		/* ArrayList
		List<Number> lst = new ArrayList<>(); // list는 인터페이스라서 객체생성 불가능 arraylist로 생성가능
		lst.add(10); lst.add(20); lst.add(30); lst.add(40); lst.add(50);
		System.out.println("length : "+ lst.size()); // list는  size를 쓴다
		lst.remove(2);
		System.out.println("length : "+ lst.size());// 중간 값 삭제 시 뒤의 값 앞으로 땡긴다 길이가 가변적이므로
		*/
		
		List<String> lst = new ArrayList<>(); // list에는 객체를 담는다 
		lst.add("A"); lst.add("B"); lst.add("C"); lst.add("D"); lst.add("E");
		System.out.println("length : " + lst.size());
		
		List<String> lst02 = new ArrayList<>();
		lst02.add("1"); lst02.add("2"); 
		lst.addAll(lst02);
		System.out.println(lst);
		lst.add(3, "F"); //삽입위치 지정가능 
		System.out.println(lst);
		
		////////////////////////////// 주의점 : 중간에 null을 포함하는 인덱스 번지에 추가하는 것들은 예외발생!
//		lst.add(300, "F"); // error : list는 중간에 null을 가질 수 없다.
//		lst.add(9, "F"); // error : list는 중간에 null을 가질 수 없다.
		
		// 특정 인덱스 번지의 데이터 삭제
		lst.remove(0);
		System.out.println(lst);
		
		// 요소검색
		System.out.println(lst.contains("c") ? "있음" : "없음"); // 데이터는 대소문자 구분한다
		
		
		// 요소를 추출
		System.out.println("요소 추출 : "+lst.get(0));
		
		// 요소의 부분 추출
		List<String> subLst = lst.subList(0, 5);
		System.out.println("subLst : " +subLst);
		
		// 요소 변경(remove&assign) : 변경 전 이 요소가 있는지 체크해야 견고한 코드임
		lst.set(1, "YBY");
		System.out.println("요소 변경 : " + lst);
		
		// 사이즈를 동적으로 늘리는 작업이 가능
		((ArrayList<String>)lst).ensureCapacity(100);  //generics 안결면 object로 풀린다
		
		
		// 보안상의 이유로 딥카피를 해야한다면?
		List<String> copyLst =(List<String>)((ArrayList<String>)lst).clone(); // clone 메서드는  arraylist 소유임. object로 반환됨 
		System.out.println("original : " + lst);
		System.out.println("copy : " + copyLst);
		lst.set(0, "YBY");
		System.out.println("original : " + lst); //original에만 반영된다. swallow copy랑은 다르다.
		System.out.println("copy : " + copyLst);
		
		// 자료구조를 배열로 반환해야한다면?
		(List<String>)((ArrayList<String>)lst)// object로 반환된다.
		System.out.println("자료구조 배열 반환 : " +ary.length);
		
		// 정렬 int - Integer
		List<Integer> sortLst = new ArrayList(); // 자료구조는 기본타입 못담음. int가 아닌 Integer로 줘야 함
		sortLst.add(3); sortLst.add(2); sortLst.add(1); 
		System.out.println(sortLst);
		System.out.println("ascending sort -");
		sortLst.sort(Comparator.naturalOrder());
		System.out.println("ascending - " + sortLst);
		sortLst.sort(Comparator.reverseOrder());
		System.out.println("decending - " + sortLst);
		
		// 순회 : 자료구조의 순회는 loop가 아닌 객체를 활용한다
		List<Person> hmsLst = new ArrayList();
		hmsLst.add(new StudentDTO("이붕이", 20, "인천", "2014"));
		hmsLst.add(new TeacherDTO("이붕이", 20, "인천", "물류"));
		hmsLst.add(new EmployeeDTO("이붕이", 20, "인천", "구매기획"));
		
		// Iterator를 통한 순회
		Iterator<Person> ite = hmsLst.iterator(); // 리턴받는 쪽은 generics 풀리면 안된다. 이거 풀면 밑에서 object로 반환됨
		while(ite.hasNext()) {
			System.out.println(ite.next().personInfo()); // Person은 personInfo에 접근가능 
		}
		
		System.out.println("다시 한번 순회 - "); // 다시 순회하면 안나온다 다시 하려면 iterator와 싱크 맞춰줘야 다시 순회 가능  
		ite = hmsLst.iterator(); // 재순회를 위한 싱크맞추기
		while(ite.hasNext()) { 
			System.out.println(ite.next().personInfo()); 
		}
		
		// List에만 있는 listIterator() 정방향 순회 + 역방향 순회
		ListIterator<Person> iter = hmsLst.listIterator();
		while(iter.hasNext()) { 
			System.out.println(iter.next().personInfo()); 
		}
		
		while(iter.hasPrevious()) { 
			System.out.println(iter.previous().personInfo()); 
		}
		
		
		// 전체 데이터를 삭제
		lst.clear();
		System.out.println(lst);
		
		
		// 모든 Collection 객체(참조)를 담는 자료구조(그릇)
		List<Integer> numberLst = new ArrayList();
		// int - Integer , char - Character (Wrapper Class) 객체화시켜주는 class
		// int x = 10; Integer xx = new Integer(x) ; -> auto boxing(기본 -> 객체)
		// Integer xx = new Integer(10) ;  int z = (int)xx + 10 -> auto Unboxing(객체 -> 기본)// 참조타입인 객체는 주소를 담는다.
//		numberLst.add(new Integer(10)); // 예전에는 일일이 객체화 시켜줘야 했었음. 요새는 자동으로 됨
//		numberLst.add('A');// Character라는 wrapper 클래스가 기본타입을 참조타입으로 바꿈
//		numberLst.add(10); // 
		System.out.println(numberLst);
		
	}

}
