import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;
import com.encore.post.view.PostView;
public class PostMain {

	public static void main(String[] args) {
		// main은 위와 같은 형태를 가진다 .
//		PostService service = new PostService() ;
//		System.out.println("debug >>>> main caller -> service savePost working method ") ;
//		
//		//case01
//		//String msg = service.savePost("YBY", "공지사항", "휴강", 0, true) ;
//		//System.out.println("Result >>>> "+msg);
//		
//		//case02
//		PostRequestDTO request = new PostRequestDTO("YBY", "공지사항", "휴강", 0, true) ;
//		String msg = service.savePost(request);
//		System.out.println("Result >>>> "+msg) ;
//	
//	
//	
//
//}


		// case 03.
		// view를 이요한 사용자 입력과 연결..
		
		//PostView view = new PostView() ;
		//view.menu() ;
		
		// case04
		// 불필요하게 발생되는 객체생성을 효율적으로 관리하기 위해서 얕은복사 개념을 사용할 수 있다 
		
		PostService service = new PostService() ;
		PostRequestDTO params = new PostRequestDTO();
		
		PostView view = new PostView(service, params);
		view.menu();
		
		
		
	}
}