import com.encore.hms.service.HmsService;
import com.encore.hms.util.HmsType;
import com.encore.hms.view.HmsView;


// 1. stu 2. tea 3. emp
// enum
public class HmsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HmsService service = new HmsService(10) ; // service를 만들 때 배열도 같이 만들어지고 있음 
//		String msg = service.makePerson(HmsType.STU, "이붕이", 20  "인천", "2014");
//		// 출력예시) 학생[강사]직원 객체를 배열에 담았습니다. 
//		System.out.println(msg);
//		msg = service.makePerson(HmsType.TEA, "이붕이", 20  "인천", "물류");
//		System.out.println(msg);
//		msg = service.makePerson(HmsType.EMP, "이붕이", 20  "인천", "동반성장");
//		System.out.println(msg);
	
		HmsView view = new HmsView();
		view.mainMenu();
	
	
	
	
	}

}
