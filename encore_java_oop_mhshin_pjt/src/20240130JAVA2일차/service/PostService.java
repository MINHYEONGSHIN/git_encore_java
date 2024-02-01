package com.encore.post.service;

import com.encore.post.domain.PostRequestDTO;

// xxxService, xxxxServiceImpl 비즈니스 로직을 처리하는 역할을 담당 
// 사용자가 블로글에 글 작성(savePost), 수정, 삭제, 검색, 읽기
// 아이디, 제목, 내용, 등록일, 조회수, 공개/비공개

public class PostService {
	// 생성자 명시 안해도 default로 들어가 있다 
	public String savePost (String id, String title, String content, int cnt, boolean isFlag) {
		System.out.println("debug >>>>working method save completed...");
		return "작성하신 글이 저장되었습니다" ;
	}
	
	public String savePost (PostRequestDTO params) { //메서드 오버로딩
		System.out.println("debug >>>>working method save completed...");
		return "작성하신 글이 저장되었습니다" ;
	}
	
	public String deletePost (PostRequestDTO params) { //메서드 오버로딩
		System.out.println("debug >>>>working method deletion completed...");
		return "작성하신 글이 삭제되었습니다" ;
	}
}

