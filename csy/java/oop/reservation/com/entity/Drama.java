package com.entity;

public class Drama extends Art{ 

	public static int DRAMA_PRICE = 100;
	
	public Drama(int reservationNum) {
		super(DRAMA_PRICE,reservationNum);
	}
	
	@Override
	public String toString() {
		return "드라마(가격 : )" +  DRAMA_PRICE+ "장 예매합니다.";
	}
}
