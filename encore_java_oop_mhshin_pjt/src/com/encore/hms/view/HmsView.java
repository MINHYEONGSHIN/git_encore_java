package com.encore.hms.view;

import java.util.Scanner;

import com.encore.hms.domain.sup.Person;
import com.encore.hms.service.HmsService;
import com.encore.hms.util.HmsType;

public class HmsView {
	
	public static Scanner scan = new Scanner(System.in); //static이므로 인스턴스 소유아님
	
	
	// HmsView는 HmsService와 의존성 주입(Dependency Injection)관계가 형성
	// 즉, HmsView는 HmsService의 객체 생성을 통한 접근을 필요로 하는 것.
	
	private HmsService service ;
	
	
	public HmsView() {
		service = new HmsService();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println(">>>> HMS Ver1.0 <<<<");
			System.out.println("1. 전체출력");
			System.out.println("2. 이름으로 검색 ");
			System.out.println("3. 이름으로 찾아서 수정");
			System.out.println("4. 이름으로 찾아서 삭제");
			System.out.println("5. 생성");
			System.out.println("99. 종료");
			System.out.println("Input Number : ");
			int number = scan.nextInt();
			switch(number) {
				case 1 :
					perPrint();
					break;
				case 2 :
					search();
					break;
				case 3 :
					update();
					break;
				case 4 :
					remove();
					break;
				case 5 :
					subMenu();
					break;
				case 99 :
					System.out.println("프로그램을 종료합니다.. 데이터는삭제됩니다 ");
					System.exit(0);
			}
		}// switch end block
	}// main menu end block
		
		/*
		 * Scanner 객체를 이용해서 찾고자하는 이름을 입력받는다
		 * 존재할 경우 해당 객체의 정보를 출력
		 * 존재하지 않을 경우 '정보가 존재하지 않습니다' 라는 메세지 출력
		 * HmsView - HmsService(searchPerson(String name))
		 * 
		 */
	
		
	public void search() {
		System.out.println();
		System.out.println("찾고자하는 이름을 입력하세요");
		System.out.println();
		scan.nextLine();
		String name = scan.nextLine();
		Person person = service.searchPerson(name);
			if(person == null) {
				System.out.println("몰라요~");
			}else {
				System.out.println(person.personInfo());
			}
	}
		
		/*
		 * Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서
		 * 존재할 경우 해당 객체의 학생-학번, 강사-과목, 직원-부서를 수정하고
		 * '정보를 수정하였습니다' 라는 메세지 출력
		 * HmsView - HmsService(updatePerson(String name))
		 */
		
		
	public void update() {
		
	}
		/*
		 * Scanner 객체를 이용해서 찾고자하는 이름을 입력받아서
		 * 존재할 경우 객체를 배열에서 삭제하고
		 * '객체를 삭제하였습니다' 라는 메세지 출력
		 * 그리고
		 * 전체출력을 했을 때 정상적으로 출력되는지 확인 
		 * HmsView - HmsService(removePerson(String name))
		 */
	public void remove() {
		
	}
	
	
	public void perPrint() {
		System.out.println();
		System.out.println(">>> 전체 출력 <<<");

		
		Person [] perAry = service.getAry();
		if(service.getIdx()==0) {
			System.out.println();
			System.out.println(">>> 데이터가 존재하지 않습니다. <<<");
			System.out.println();
		} else {
			for (int idx=0 ; idx < perAry.length; idx++) {
				Person per = perAry[idx];
				if(per == null) {
					break;
				}
				System.out.println(per.personInfo());
			}
			/// or 
			for(Person per : perAry) {
				System.out.println(per.personInfo());
			}
		}
	}
		
		public void subMenu() {
			while(true) {
				System.out.println(">>>> 객체 생성을 위한 Sub Menu <<<<");
				System.out.println("1. 학생");
				System.out.println("2. 강사 ");
				System.out.println("3. 직원");
				System.out.println("99. 상위메뉴 이동");
				System.out.println("Input Number : ");
				int number = scan.nextInt();
				switch(number) {
					case 1 :
						makePerson(number) ;
						break;
					case 2 :
						makePerson(number) ;
						break;
					case 3 :
						makePerson(number) ;
						break;
					case 99 : 
						return;
				}// switch end block
			}		
		}
	
	public void makePerson(int number) {
		System.out.println();
		System.out.println(" >>> 객체 생성 <<<");
		
		// Scanner 이름, 나이 주소, comm 받기 
		// HmsService - makePerson() 연결
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();
		System.out.println("주소를 입력하세요.");
		String address = scan.nextLine();
		
		/*
		String common = (number == 1) ?
				"학번을 입력해주세요" : (number == 2) ?
						"과목을 입력해주세요" : "부서를 입력해주세요";
		*/
		String comm = null;
		String msg = null ;
		switch(number) {
			case 1:
				System.out.println("학번을 입력해주세요 : ");
				comm = scan.nextLine();
				msg = service.makePerson(HmsType.STU, name, age, address, comm) ;
				break;
			case 2:
				System.out.println("과목을 입력해주세요 : ");
				comm = scan.nextLine();
				msg = service.makePerson(HmsType.TEA, name, age, address, comm) ;
				break;
			case 3:
				System.out.println("부서를 입력해주세요 : ");
				comm = scan.nextLine();
				msg = service.makePerson(HmsType.EMP, name, age, address, comm) ;
				break;
		}
		
		System.out.println(msg);
		
	}
}