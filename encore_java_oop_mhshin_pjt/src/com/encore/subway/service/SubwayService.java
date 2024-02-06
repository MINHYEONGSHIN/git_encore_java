package com.encore.subway.service;

import com.encore.subway.domain.CardDTO;
import com.encore.subway.domain.StationDTO;

public interface SubwayService {
	
	// 1.constance 
	// public int x = 10; // 묵시적으로 static final이 붙어버림 따라서 private 안됨, 상수는 선언과 동시에 초기화해줘야 함 
	
	// 운행요금을 반환하는 메서드(잔액 부족할 경우 -1)
	// CardDTO : 소유카드(충전) StationDTO start : 출발역, StationDTO end : 종착역 
	public int chargeFree(CardDTO card, StationDTO start, StationDTO end) ; // 추상적메서드
	
	//카드요금을 차감하는 메서드
	// amount : 차감금액 
	//차감이 성공하면 true, 실패하면 false 반환 
	public boolean subtractBalance(CardDTO car, int amount) ;
	
	
	//출발역과 종착역 사이의 거리 계산
	//역간거리를 반환하는 메서드 
	public int getDistance(StationDTO start, StationDTO end) ; 

}
