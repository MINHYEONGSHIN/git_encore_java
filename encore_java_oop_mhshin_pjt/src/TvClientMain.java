import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.factory.TvBeanFactory;
import com.encore.tv.util.TV;

public class TvClientMain {

	public static void main(String[] args) {
		/*
 		SamsungTV tv = new SamsungTV(); //클라이언트에게 생성되는 타입 오픈됨. 결합도가 너무 강함.
		tv.powerOn();
		*/

		
//		LgTV tv = new LgTV() ;
//		tv.turnOn() ;
		
//		TV tv = new SamsungTV() ; // loose coupling
//		tv.turnOn();
		
		TvBeanFactory factory01 = TvBeanFactory.getInstance()	;
		System.out.println(factory01);
		
		TV tv = factory01.getBean("lg");
		tv.turnOn() ;
		
	}
}
