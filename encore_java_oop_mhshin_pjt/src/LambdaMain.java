import com.encore.lambda.ILambda;
import com.encore.lambda.LambdaImpl;
import com.encore.lambda.Operation;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ILambda lambda = new ILambda() { //인터페이스지만 객체생성됨
//			@override 
//			public void printInfo(String str) {// 일회용으로 쓰고 버리기
//				System.out.println(str);
//			}
//
//			@Override
//			public int add(int x, int y) {
//				// TODO Auto-generated method stub
//				return x+y;
//			}
//		};
		
//		ILambda lambda = (int x , int y) -> {
//			return x+y;
//		};
//		System.out.println("add = " + lambda.add(10, 10));
		
		
		
//		ILambda lambda = (str) -> System.out.println(str);
//		lambda.printInfo("YBY");
//		ILambda lambda2 = (10,10) ->
		
		
//		ILambda lambda = new LambdaImpl();
//		lambda.printInfo("기존코드방식");
//		System.out.println("add = " + lambda.add(10, 10));
		
		
//		int addSum = result((x,y) -> x+y);
//		System.out.println("add="+addSum);
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i = 0 ; i < 10 ; i++) {
//					System.out.println(i);
//				}
//				
//			}
//		});
//		thread.start();
		
//		Thread thread = new Thread(
//				() -> {
//					for(int i = 0 ; i < 10 ; i++) {
//						System.out.println(i);
//					}
//				}
//		);
//		thread.start();
		System.out.println(Operation.DIVIDE.apply(2, 3));
	}
	
	public static int result(ILambda lambda) { //static은 static만 호출 가능, 메서드가 메서드를 인자로 받을 수 있다
		return lambda.add(10, 10);
	}

}
