package com.encore.tv.factory;

import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.util.TV;

/*
 * Singleton Pattern : 무분별한 객체 생성 방지, 인스턴스의 갯수를 하나로 유지하는 방법
 * 구현바업
 * 1. 생성자의 접근지정자를 private으로 지정
 * 2. getInstance() 정의해서 자기자신의 생성된 객체를 반환 
 */
public class TvBeanFactory { // framework가ㅣ 인스턴스를 생성해서 관리하는 것 : beanfactory.
	private TV [] ary ; // TV는 인터페이스라 담을 수 없으므로 객체인 STV나 LTV를 담는다
	private static TvBeanFactory instance ;
	
	private TvBeanFactory() {
		ary = new TV [2];
		ary[0] = new SamsungTV(); // 싱글턴은 한번씩만 생성된다 
		ary[1] = new LgTV();
	}
	
	public static TvBeanFactory getInstance() {
		if(instance == null) {
			instance = new TvBeanFactory();
		}
		return instance;
	}
	
	
	public TV getBean(String brandName) {
		return (brandName.equals("samsung")) ? ary[0] : ary[1] ;
	}
}
