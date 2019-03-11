package com.biz;

import com.entity.Art;

public interface IReservationBiz {
	//예매 로직 구현 메소드를 선언한 interface

	public void addReservation(Art art);
	public void printReservation();
	
	/**
	 * ??인터페이스를 생성하고 추상메소드를 구현하여 사용하는 이유?
	 */
}
