package com.entity;

public class Art {
	private int price; //����
	private int reservationNum; //���ż�
	
	
	
	//���� ���� ������
	public Art(int price, int reservationNum) {
		
	}
	/**
	 * ��Ŭ���� ������� �ڵ������� ������
	 * @param price
	 * @param reservationNum
	 
	public Art(int price, int reservationNum) {
		super();
		this.price = price;
		this.reservationNum = reservationNum;
	}
	
	*/

	
	
	
	
	
	
	/**
	 * getter/setter
	 * @return
	 */
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getReservationNum() {
		return reservationNum;
	}
	public void setReservationNum(int reservationNum) {
		this.reservationNum = reservationNum;
	}
	
	
	/*
	 * �̰� �־�� Movie.java���� toString �޼ҵ带 �������̵� ��������?
	
	public String toString(Art art) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
