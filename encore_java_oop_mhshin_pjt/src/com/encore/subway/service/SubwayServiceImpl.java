package com.encore.subway.service;

import com.encore.subway.domain.CardDTO;
import com.encore.subway.domain.StationDTO;

public class SubwayServiceImpl implements SubwayService {
	
	public static final int BASIC_FEE = 800 ;

	@Override
	public int chargeFree(CardDTO card, StationDTO start, StationDTO end) {
		// TODO Auto-generated method stub
		int fee = 0;
		int distance = getDistance(start, end);
		System.out.println("distance : " + distance);
		if(distance <= 12) {
			fee = BASIC_FEE ;
		} else if(distance > 12 && distance <= 42) {
			fee = (int) (BASIC_FEE + Math.ceil((distance-12)/6)*100) ;
		} else {
			fee = BASIC_FEE + 500 + ((distance-42)/12)*100 ;
		}
		// 요금 차감 
		if(subtractBalance(card, distance)) {
			return fee ;
		} else {
			return -1 ;
		}

	}

	@Override
	public boolean subtractBalance(CardDTO card, int amount) {
		// TODO Auto-generated method stub
		int currentBalance = card.getBalance() - amount ;
		if(currentBalance >= 0) {
			card.setBalance(currentBalance);
			return true ;
		}
		return false;
	}

	@Override
	public int getDistance(StationDTO start, StationDTO end) {
		// TODO Auto-generated method stub
		return Math.abs(start.getLocation() - end.getLocation());
	} //Impl : 인터페이스를 implements하는 클래스이다

}

