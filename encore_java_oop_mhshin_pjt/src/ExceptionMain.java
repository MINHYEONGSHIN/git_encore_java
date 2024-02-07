
public class ExceptionMain {

	public static void main(String[] args) throws Exception {
		/* 예외처리 기본정리(try ~ cathc ~ finally)
		String [] strAry = {"SW", "java", "python"};
		try {
			System.out.println("예외 발생 코드 시작점");
			for(int idx = 0 ; idx < strAry.length; idx++ ) {
				System.out.println(strAry[idx]);
			}
			System.out.println("예외 발생 코드 종료 ");
		} catch(Exception e) { // 프로그램 예외발생 시 바로 catch로 넘어간다. 비정상적처리를 정상적 처리로 바꾸는것이 목적이다.
//			System.out.println("예외 발생시 호춮되는 영억");
			e.printStackTrace();
		} finally {
			System.out.println("예외발생 여부와 상관없이 항상 수행");
		}
		System.out.println(">>>main method end<<<");
		*/
		try {
			int result = userException();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>> main metod end/");
	
	
	public static int  userException() throws ArithmeticException(){  
		int result = 10/0;
		return result;
	}
}
