package com.entity;

public class Musical extends Art{

	public static int MUSICAL_PRICE = 100;
	
	public Musical(int reservationNum) {
		super(MUSICAL_PRICE,reservationNum);
	}
	
	@Override
	public String toString() {
		return "������(���� : )" +  MUSICAL_PRICE+ "�� �����մϴ�.";
	}
}
