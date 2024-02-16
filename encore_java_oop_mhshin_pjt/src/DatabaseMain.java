import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.encore.mvc.domain.DepartmentResponseDTO;

public class DatabaseMain {

	public static void main(String[] args) {
		// url, vender 사의 drvier(vender 사 별 library), 사용자 계정 
		// 상수는 변수 이름 전체가 CAPITALIZED 되어있어야 한다
		
		String URL = "jdbc:mariadb://localhost:3306/encore"; 
		String DRIVER = "org.mariadb.jdbc.Driver";
		String ID = "root";
		String PASSWORD = "GKDFKO150!";
		/*
		 * JDBC
		 * try {
		 * ==================ORM(Mybatis, JPA)=======================
		 * 1. Vender 사에서 제공하는 드라이버 로딩
		 * 2. connection(Url, id, pw)
		 * 3. 실행구문을 담을 수 있는 그릇(Statement, PreparedStatement)
		 * 4. 실행(execute) - executeQuery(select) : 결과반환 -(rset)-> 프로그램영역으로 반환, executeUpdate(insert, update, delete)
		 * 5. 실행결과를 반환 받는다
		 * ==========================================================
		 * 6. 결과를 객체화시키고 다건인 경우 자료구조를 사용하여 담는다.
		 * 7. 외부리소스(디비연결)를 닫는 것
		 * } catch() {
		 * 
		 * } finally {
		 * 
		 * }
		 */
		Connection conn = null ;
		PreparedStatement	pstmt = null ; // 그릇
		ResultSet		 	rset  = null ;
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 완료"); //  driver는 vender 사에서 제작한 jdbc interface들이 들어있다 
			conn = DriverManager.getConnection(URL, ID, PASSWORD); // connection이 하나 넘어온다.
			System.out.println("디비연결 완료 >>" + conn);
			
//			single finder select
//			String sql = "select dept_id, dept_name, loc_id from department where dept_id = ? "; // 여기에서는 sql 마지막에 ; 쓰면안됨, 문자열은 '' 꼭 넣기, ?는 동적바인딩
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "10"); // ?의순서 , 바인딩 값
//			rset = pstmt.executeQuery(); // java로 가상의 테이블이 넘어옴(rset). 넘어온 변수들을 dto에 담는다
//			DepartmentResponseDTO response = null ;
//			// 커서를 내려주는 작업
//			while(rset.next()) {
//				response = new DepartmentResponseDTO();
//				response.setDept_id(rset.getString(1));
//				response.setDept_name(rset.getString(2));
//				response.setLoc_id(rset.getString(3));
//			}
//			System.out.println("Result >>>> " + response);
			String sql = "insert into department values(?,?,?)"; // 쿼리문안에 ; 넣으면 안됨 ORM에서는 안되기 때문
			pstmt = conn.prepareStatement(sql); //  그릇
			pstmt.setString(1, "70"); 
			pstmt.setString(2, "교육");
			pstmt.setString(3, "A3"); 
			int result = pstmt.executeUpdate();
			System.out.println("DML Result >>>> " + result);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {conn.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
