import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.encore.mvc.controller.InsertController;
import com.encore.mvc.controller.SelectController;
import com.encore.mvc.domain.PostRequestDto;
import com.encore.mvc.domain.PostResponseDto;

public class MvcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자의 입력화면을 통해서 게시글 작성을 요청하는 영역 
		InsertController insert = new InsertController();
		
		//사용자가 입력한 값을 dto에 담아서 controller에게 전달하고 있는 구조
//		PostRequestDto params = new PostRequestDto();
//		params.setTitle("1");
//		params.setContent("1");
//		params.setWriter("1");
//		int flag = insert.execute(params);
		
//		Map<String, String> map = new HashMap<String, String>(); // controller에서 바로 map에 담아서 dao로 넘기기 
//		map.put("title", "이붕이");
//		map.put("content", "이붕이");
//		map.put("writer", "이~붕이");
//		map.put("writer", "이~붕씨"); // 기존데이터 삭제 후 삽입
//
//		int flag = insert.execute(map);
//		
//		System.out.println(">>> insert Result : " + flag);
		
		System.out.println(">>> 전체 출력 <<<");
//		SelectController select = new SelectController();
//		List<PostResponseDto> list = select.execute();
		//출력
		
	}

}
