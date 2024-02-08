import java.io.IOException;

import com.encore.stream.IODemo;

/* byte - short - int - long - float - double 
 * char , boolean
 */
public class IODemoMain {

	public static void main(String[] args) {
		IODemo demo = new IODemo();
//		case01
//		String msg = null;
//		try {
//			 msg = demo.inputStr();
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(msg);
//		String [] strAry = msg.split(" ");
//		System.out.println("length : " + strAry.length);
//		int sum = 0;
//		for(String data : strAry) {
//			sum += Integer.parseInt(data) ;
//		}
//		System.out.println(sum);
		
		// case02
//		int data = demo.inputInt();
//		System.out.println(data);
//		System.out.println();
//		System.out.println(">>> main end <<<<");
		
//		case03
//		try {
//			demo.first(0); // main에서는 던지지말고 처리해야한다
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(">>>main end<<<");
		
		//case04 : docs oracle 참조 
//		String msg = "aBc";
//		System.out.println(msg.equals("abc"));
//		System.out.println(msg.equalsIgnoreCase("abc"));
//		System.out.println(msg.toUpperCase());
//		System.out.println(msg.toLowerCase());
//		System.out.println(msg.length());
//		System.out.println(msg.contains("B"));
//		System.out.println(msg.startsWith("a"));
//		System.out.println(msg.endsWith("c"));
//		msg = " a b c ";
//		System.out.println(msg.trim().length());
//		msg = "abcdef" ; // 문자열 = 문자의 연결
//		System.out.println(msg.charAt(1));
//		System.out.println(msg.substring(2));
//		System.out.println(msg.substring(2, 5));
		
		//case05
//		boolean flag = demo.outputFile();
//		String msg = (flag == true) ? "저장성공" : "저장실패" ;
//		System.out.println(msg);
		
		//case06
		/*
		boolean flag = demo.outputObjFile();
		String msg = (flag == true) ? "저장성공" : "저장실패" ;
		System.out.println(msg);
		*/
		
		//case07
		demo.outputSerializable();
//		demo.inputSerializable();
	}

}
