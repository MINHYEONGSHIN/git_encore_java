import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;

public class OopExtendsMain {

	public static void main(String[] args) {
		// 객체생성
		StudentDTO stu02 = new StudentDTO("MOY", 27, "청원구", "2017");
		System.out.println(stu02.personInfo());
		System.out.println(stu02.studentInfo());

		EmployeeDTO emp01 = new EmployeeDTO("신민형", 30, "부평구", "CPO)동반성장팀");
		System.out.println(emp01.personInfo());
		System.out.println(emp01.employeeInfo());
		
		TeacherDTO tcr01 = new TeacherDTO("신민형", 30, "부평구", "구매물류");
		System.out.println(tcr01.personInfo());
		System.out.println(tcr01.teacherInfo());
	}

}
