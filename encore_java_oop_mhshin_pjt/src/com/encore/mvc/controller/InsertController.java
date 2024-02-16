package com.encore.mvc.controller;

import java.util.Map;

import com.encore.mvc.domain.PostRequestDto;
import com.encore.mvc.model.service.EncoreServiceImpl;


// controller는 service를 갖는다 
public class InsertController { // service쪽으로 데이터를 넘긴다 
	
	private EncoreServiceImpl service ;
	public InsertController() {
		service = new EncoreServiceImpl() ;
	}
	
	public int execute(PostRequestDto params) {
		System.out.println(">>> InsertController execute <<<");
		System.out.println(">>> params : " + params);
		
		// 서비스와 의존관계형성 후 메서드 호출 /반환 
		int flag = service.insertService(params);
		return flag;
	}
	
	public int execute(Map<String, String> params) {
		System.out.println(">>> InsertController execute <<<");
		System.out.println(">>> params : " + params);
		
		// 서비스와 의존관계형성 후 메서드 호출 /반환 
		int flag = service.insertService(params);
		return flag;
	}

}
