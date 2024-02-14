package com.encore.thread;

/*
 * 멀티thread 환경에서 공유객체를 동시에 사용할 때 발생하는 뒤죽박죽 문제를 해결하기 위해서는,
 * 동기화 작업이 필요하다
 * synchronized 키워드를 이용하는 방법이 있다.
 */

public class PrtThread implements Runnable {
	
	private Prt moniter;
	private char charValue;
	
	public PrtThread(char charValue, Prt moniter) {
		this.charValue = charValue;
		this.moniter = moniter;
	}
	
	@Override
	// public synchronized void run() {  이렇게하면 보장 안됨
	public void run() {
		synchronized (moniter) { // 잠궈서 아래 작업을 보장하겠다 cpnquarancy 이슈 해결 
			for(int i = 0 ; i < 10 ; i++) {
//				synchronized (moniter) {
					moniter.printChar(charValue);
//				}
			}

		}
	}
}
