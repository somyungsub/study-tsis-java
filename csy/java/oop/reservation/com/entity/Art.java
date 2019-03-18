package com.entity;

public class Art {
	private int price; //가격
	private int reservationNum; //에매수
	
	
	
	//내가 만든 생성자
	public Art(int price, int reservationNum) {
		
	}
	/**
	 * 이클립스 기능으로 자동생성한 생성자
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
	 * 이게 있어야 Movie.java에서 toString 메소드를 오버라이딩 가능한지?
	
	public String toString(Art art) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
