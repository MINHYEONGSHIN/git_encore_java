import com.encore.thread.Prt;
import com.encore.thread.PrtThread;

public class PrtThreadMain {

	public static void main(String[] args) {
		
		System.out.println("main thered start !! ");
		// TODO Auto-generated method stub
		Prt prt = new Prt() ;
//		prt.printChar('A');
//		System.out.println();
		
		PrtThread runnable01 = new PrtThread('A', prt);
		Thread		thread01   = new Thread(runnable01);
		thread01.start();
		
		PrtThread runnable02 = new PrtThread('B', prt);
		Thread		thread02   = new Thread(runnable02);
		thread02.start();
		
		PrtThread runnable03 = new PrtThread('C', prt);
		Thread		thread03   = new Thread(runnable03);
		thread03.start();
		
		System.out.println("main thered end !! "); // 멀티 thread를 동작시키고 그 thread들이 한 객체를 공유하게되면 순서가 뒤죽박죽으로 실행된다. -> lock을 걸어 해결한다 				
	}

}
