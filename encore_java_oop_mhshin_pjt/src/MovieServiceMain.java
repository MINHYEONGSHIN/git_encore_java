import com.encore.movie.workshop7.MovieServiceImpl;

public class MovieServiceMain {

	public static void main(String[] args) {

		MovieServiceImpl service = new MovieServiceImpl();
		String selectedSentence = service.selectSentence();
		System.out.println("영화제목 >>> : " + selectedSentence);
		
		System.out.println(service.disguiseSentence(selectedSentence));
		//String str = service.initGame(selectedSentence) ;
		//StringBuffer solving = new StringBuffer(str);
	}

}
