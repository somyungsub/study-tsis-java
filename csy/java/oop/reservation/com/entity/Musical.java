package com.entity;

public class Musical extends Art{

	public static int MUSICAL_PRICE = 100;
	
	public Musical(int reservationNum) {
		super(MUSICAL_PRICE,reservationNum);
	}
	
	@Override
	public String toString() {
		return "뮤지컬(가격 : )" +  MUSICAL_PRICE+ "장 예매합니다.";
	}
}
