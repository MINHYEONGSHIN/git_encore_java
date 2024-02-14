import com.encore.thread.ShareObj;

public class ThreadDemoMain {
	
	public static void main(String[] args) {
		System.out.println("main thread start !!");
		
		
		Runnable obj = new ShareObj(); //thread의 대상이 되는 객체, interface도 객체의 타입으로 사용 가능.
		Thread	 thread01 = new Thread(obj);
		thread01.start();
		
		Runnable obj02 = new ShareObj(); // thread 얘까지 총 3개 동작.
		Thread	 thread02 = new Thread(obj02);
		thread02.start();
		
//		obj.running();
//		obj.running();
		
		
		System.out.println("main thread end !!");
	}

}
