package com.entity;

public class Drama extends Art{ 

	public static int DRAMA_PRICE = 100;
	
	public Drama(int reservationNum) {
		super(DRAMA_PRICE,reservationNum);
	}
	
	@Override
	public String toString() {
		return "���(���� : )" +  DRAMA_PRICE+ "�� �����մϴ�.";
	}
}
