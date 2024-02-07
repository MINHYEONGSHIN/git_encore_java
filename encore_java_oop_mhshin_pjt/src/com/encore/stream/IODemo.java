package com.encore.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo {
	public IODemo() {
		
	}

	public String inputStr() throws IOException { // throws 간접적인 예외처리방식, 이상적인 방식은 아님
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input Message : ");
		
		String data = reader.readLine();
		
		return data ;
	}
	
	public int inputInt() { // throws 간접적인 예외처리방식, 이상적인 방식은 아님
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input Message : ");
		
		int data = 0;
		try {
			data = Integer.parseInt(reader.readLine());
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return data ;
	}
	
	public void first(int flag) throws EncoreException {
		System.out.println(">>> first start");
		try {
			second(flag) ;
		} finally {
			System.out.println(">>> first end");
		}
	}
	
	public void second(int flag) throws EncoreException {
		System.out.println(">>> second start");
		try {
			third(flag) ;
		} finally {
			System.out.println(">>> second end");
		}
		
		
	}
	public void third(int flag) throws EncoreException {
		System.out.println(">>> third start");
		try {
			if(flag == 0) {
				throw new EncoreException("사용자 정의 예외 발생");
			}
		} finally {
			System.out.println(">>> third end");
		}
	}
	
} 
