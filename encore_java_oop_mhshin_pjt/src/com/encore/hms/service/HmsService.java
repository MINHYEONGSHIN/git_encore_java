// 모든 요청이 넘어오는 곳.
package com.encore.hms.service;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;

/*
 * business logic 가지고 있는 클래스
 * 1.배열을 관리
 * 2. 생성된 배열에 학생 강사 직원 객체를 담을 것
 * 3. 배열의 인덱스를 이용해서 찾기, 수정, 삭제 등의 기능을 수행할 것  
 */
public class HmsService {
	
	private Person [] perAry ; // 전역변수
	private int idx ;
	
	public HmsService() {	
	}
	
	public HmsService(int size) {
		perAry = new Person[size] ; // 객체 생성 시 배열 생성
	}
	
	// 객체 생성 후 배열에 담는 로직. 
	public String makePerson(HmsType flag ,String name,int age ,String address ,String comm) {
		// TODO Auto-generated method stub
		String msg = null ;
		Person obj = null ;
		switch(flag) {
			case STU : 
				obj = new StudentDTO(name, age, address, comm);			
			case TEA :
				obj = new TeacherDTO(name, age, address, comm);
			case EMP :
				obj = new EmployeeDTO(name, age, address, comm);
				break;
		}
		setAry(obj);
		return (idx-1) + "번지에 데이터를 담았습니다." ;
		
	}
	
	public void setAry(Person per) {
		perAry[idx++] = per ;
	}
	
	public int getIdx() {
		return idx;
	}
	
	public Person[] getAry() {
		return perAry;
	}
	
	//찾기
	public Person searchPerson(String name) {
		Person person = null ;
		
		for(int idx=0 ; idx < perAry.length ; idx++) {
			person = perAry[idx];
			if(person != null) {
				if(person.getName().equals(name)) {
					return person ;
				}
			}

		}
		return null ;
		
	}
}
