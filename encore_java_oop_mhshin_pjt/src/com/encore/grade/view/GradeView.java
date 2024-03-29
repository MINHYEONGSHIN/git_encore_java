package com.encore.grade.view;



import com.encore.grade.entity.EmployeeDTO;
import com.encore.grade.entity.StudentDTO;

public class GradeView {
	
	private EmployeeDTO [] empAry ;
	private int idx ;
	//////////////////////////////// 과목별 총점을 담을 수 있는 변수 
	private int oracleSum = 0 , javaSum=0, servletSum = 0 ;
	
	
	public GradeView() {
		empAry = new EmployeeDTO [5] ;
	}
	
	public void init() {
		empAry[idx++] = new StudentDTO("kim", "10000", 22, 100, 100, 100);
		empAry[idx++] = new StudentDTO("lee", "10001", 23, 20, 20, 20);
		empAry[idx++] = new StudentDTO("park", "10002", 24, 30, 30, 30);
		empAry[idx++] = new StudentDTO("choi", "10003", 25, 40, 40, 40);
		empAry[idx++] = new StudentDTO("steve", "10004", 26, 50, 50, 50);
	}
	
	public void gradeSum() {
		for(int i = 0 ; i < empAry.length ; i ++) {
			EmployeeDTO obj = empAry[i] ;
			oracleSum += ((StudentDTO)obj).getOracle();
			javaSum += ((StudentDTO)obj).getJava();
			servletSum += ((StudentDTO)obj).getServlet();
			
		}
	}
	
	public void display() {
		gradeSum();
		//////////////
		System.out.println("번호\t이름\t오라클\t자바\t서블릿\t총점\t평균");
		System.out.println("==================================================");
		for(int i = 0 ; i < empAry.length ; i++) {
			StudentDTO obj = (StudentDTO)empAry[i];
			System.out.println((i+1) + "\t" + obj.getName() + "\t" +  obj.getOracle() + "\t" + obj.getJava() + "\t" + obj.getServlet()
								+ "\t" + (obj.getOracle()  + obj.getJava() + obj.getServlet())
								+ "\t" + (obj.getOracle()  + obj.getJava() + obj.getServlet())/3);
		}
		System.out.println("==================================================");
		System.out.println("총점(오라클, 자바, 서블릿) : " + oracleSum + "\t" +javaSum + "\t" +servletSum);
	}
	
	
}
