
/*
 * Map Interface
 * 비선형 자료구조
 * key value 데이터를 관리 
 * 값은 중복허용 key는 중복허용 x 
 * 직접파일 형식처럼 direct access 가능하여 검색에  용이하다 
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemoMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println("value 추가 >>>>>>");
		map.put("title", "이붕이");
		map.put("content", "이붕이");
		map.put("writer", "이~붕이");
		map.put("writer", "이~붕씨"); // 기존데이터 삭제 후 삽입
		System.out.println("출력 >>>>>");
		System.out.println(map); // 순서대로 안나온다 
		
		// 순서가 없는 map의 내용물을 확인하는 방법
		System.out.println("entrySet >>>>>>> Entry(key, value");
		for(Entry<String, String> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey()+"," + entrySet.getValue());
		}
		
		System.out.println();
		System.out.println(" keySet >>>>>");
		for(String key : map.keySet() ) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		//////////////////////////////////////////////////////
		List<String> lst01 = new ArrayList<String>();
		lst01.add("A"); lst01.add("B"); lst01.add("C");
		
		List<String> lst02 = new ArrayList<String>();
		lst02.add("D"); lst02.add("E"); lst02.add("F");
		
		Map<String, List<String>> multiLst = new HashMap<String, List<String>>();
		multiLst.put("a_section", lst01);
		multiLst.put("b_section", lst02);
		
		////////////////////////////// 꺼내기
		System.out.println();
		List<String> a_section_lst = multiLst.get("a_section");
		for(String data : a_section_lst) {
			System.out.println(data);
		}
	}

}
