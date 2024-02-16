package com.encore.mvc.controller;

import com.encore.mvc.domain.PostRequestDto;
import com.encore.mvc.model.service.EncoreServiceImpl;

public class SelectController {
	
	private EncoreServiceImpl service ;

	public SelectController() {
		service = new EncoreServiceImpl();
	}
	
	public int execute(PostRequestDto params) {
		System.out.println(">>> SelectController execute <<<");
		System.out.println(">>> params : " + params);
		int flag = service.insertService(params);
		return flag;
	}
}
