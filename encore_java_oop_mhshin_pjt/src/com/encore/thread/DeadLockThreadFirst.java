package com.encore.thread;

public class DeadLockThreadFirst implements Runnable{

	private StringBuffer sb01, sb02 ; // 현업에서는 string 보다 이거를 선호 
	// String : concat를 할 때마다 객체가 만들어진다, StringBuffer 사용 시 객체는 1개만 만들어진다
	
	public DeadLockThreadFirst() {
		
	}
	
	public DeadLockThreadFirst(StringBuffer sb01, StringBuffer sb02) {
		this.sb01 = sb01 ;
		this.sb02 = sb02 ;
	}

	
	
	@Override
	public void run() {
		synchronized (sb01) {
			sb01.append("encore");
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
//		synchronized (sb02) {
			sb02.append("hanhwa");
			System.out.println("first thread >>> " + sb01.toString() + sb02.toString());
//		}
		
		
	}
	
}
