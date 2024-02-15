import java.util.Stack;

import com.encore.data.structor.stack.EncoreStack;

public class StackDemoMain {

	public static void main(String[] args) {

//		case 01
//		Stack<Integer>  stack = new Stack<Integer>() ;
//		stack.push(10); stack.push(20); stack.push(30); stack.push(40);
//		System.out.println(stack);
//		System.out.println(stack.pop()); // 완전히 꺼내버리는 것
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.pop());
		
		
//		Stack<String> stack = new Stack<String>();
//		System.out.println("empty : " + stack.empty());
//		System.out.println("empty : " + stack.isEmpty());
//		System.out.println("스택에 데이터가 없을 때 입력하고 싶다면? ");
//		if(stack.isEmpty()) {
//			stack.push("One"); stack.push("Two"); stack.push("Three"); 
//		}
//		System.out.println(stack);
//		stack.add(0,"Four"); // 지양\
//		System.out.println(stack);
//		String str = stack.pop();
//		System.out.println("pop : " + str);
//		System.out.println(str.equals("Four"));
//		System.out.println("size : " + stack.size());
//		System.out.println(stack);
//		System.out.println("search : " + stack.search("One")); // 꺼내지는 순서 : 2
//		System.out.println("search : " + stack.search("Four")); // 꺼내지는 순서 : 3
		
		
		EncoreStack stack = new EncoreStack();
//		stack.push(10);
//		System.out.println(stack.pop());
		
		stack.push(10); stack.push(9); stack.push(8); stack.push(7);
		if(stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		} else {
			System.out.println(stack.pop());
		}
		
		stack.prtStack();
		System.out.println("peek : " + stack.peek());
		stack.prtStack();
	
		System.out.println("main end");
	
	
	}

}
