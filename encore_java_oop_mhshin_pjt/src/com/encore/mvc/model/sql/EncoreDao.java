package com.encore.mvc.model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import com.encore.mvc.domain.PostRequestDto;
import com.encore.mvc.domain.PostResponseDto;

// Dao - database 관계를 전담하는 객체 
public class EncoreDao { // db 연동만 하는 객체 
	
	public static final String URL = "jdbc:mariadb://localhost:3306/encore"; 
	public static final String DRIVER = "org.mariadb.jdbc.Driver";
	public static final String ID = "root";
	public static final String PASSWORD = "GKDFKO150!";
	
	
	public EncoreDao() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// front에서 넘어오는 자료의 종류는 dto일수도 map일수도 있으므로 2개만든다 
	public int insertRow(PostRequestDto params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		Connection				conn = null;
		PreparedStatement		pstmt = null ; // 그릇
		int						flag  = 0;
		String					query = "insert into post_tbl(title, content, writer) values(?,?,?)";
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, params.getTitle());
			pstmt.setStrin
		}
		
		// int flag = executeUpdate()
		return flag ;
	}
	

	
	
	public int insertRow(Map<String, String> params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		Connection conn = null ;
		PreparedStatement	pstmt = null ; // 그릇
		int 				flag  = 0 ;
		String				query = "insert into post_tbl(title, content, writer) values(?,?,?)";
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, params.get("title")); 
			pstmt.setString(2, params.get("content")); 
			pstmt.setString(3, params.get("writer"));
			flag = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {conn.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		// int flag = executeUpdate();
		return flag ;
	}
	
	// PostResponseDto - idx, title, content, writer
	// return list.add(PostResponseDto)
	public List<PostResponseDto> selectRow() {
		System.out.println(">>>> Dao selectRow <<< ");
		
		String query = "select idx, title, content, writer from post_tbl";
		
		return null;
	}

}
