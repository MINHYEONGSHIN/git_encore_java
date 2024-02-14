// 모든 요청이 넘어오는 곳.
package com.encore.hms.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;
import java.util.Arrays;
/*
 * business logic 가지고 있는 클래스
 * 1. Collection(List)을 관리
 * 2. 생성된 Collection에 학생 강사 직원 객체를 담을 것
 * 3. 자료구조화 되어있는 메서드를 이용해서 찾기, 수정, 삭제 등의 기능을 수행할 것  
 */
public class HmsListService {
	
	private List<Person> lst ;
	
	public HmsListService() {	
	}
	
	public HmsListService(int size) {
		lst = new ArrayList<>();
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
		return lst.size() + "번지에 데이터를 담았습니다." ;
		
	}
	
	public void setAry(Person per) {
		lst.add(per);
	}
	
	public List<Person> getAry() { // return 해준 객체에 손을 대면 어떻게 하나?
		return lst;
	}
	
	public int getIdx() {
		return lst.size();
	}
	

	
	//찾기
	//Iterator 코드 변경해보기
	public Person searchPerson(String name) {
		for(int idx = 0 ; idx < lst.size() ; idx ++) {
			Person per = lst.get(idx) ;
			if(per.getName().equals(name)) {
				return per ;
			}
		}
		return null ;
	}
	// 수정
	// deep copy 방법
	// 1. 배열객체가 가지고 있는 clone();
	// 2. Arrays.copyOf(ary, ary.length);
	public Person updatePerson(String name) {
		
		//1.
//		Person[] copyAry = perAry.clone();
		
		//2.
//		import java.util.Arrays;
//		person[] copyAry1 = Arrays.copyOf(perAry, perAry.length);
//		
//		System.out.println("original ary address : "+perAry);
//		System.out.println("copy     ary address : "+copyAry);
		
		return searchPerson(name) ;
	}
	
	public boolean removePerson(String name) {
		for(int i = 0 ; i < lst.size() ; i++) {
			Person person = lst.get(i);
			
			if(person.getName().equals(name)) {
				lst.remove(i);
				
				}
			}
		
	return false;
	}
	
	public void saveToFile() {
	
		FileOutputStream   fis = null;
		ObjectOutputStream oos = null; 
		try {
			fis = new FileOutputStream("c:/file/hms_list.txt");
			oos = new ObjectOutputStream(fis) ;
			
			oos.writeObject(lst);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {oos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void loadToFile() {

		FileInputStream   fis = null;
		ObjectInputStream oos = null; 
		try {
			fis = new FileInputStream("c:/file/hms.txt");
			oos = new ObjectInputStream(fis) ;
			lst = (List<Person>) oos.readObject();			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {oos.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
