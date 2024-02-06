package com.encore.subway.domain;

public class CardDTO {
	
	private int balance ;
	

	public CardDTO() {
		super();
	}

	public CardDTO(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CardDTO [balance=" + balance + "]";
	} 
	
	
	
}
