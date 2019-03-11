package com.test;

import com.biz.ReservationBiz;
import com.entity.Art;
import com.entity.Drama;
import com.entity.Movie;
import com.entity.Musical;

public class ReservationTest {

	public static void main(String args[]) {
		
		//1. 비즈니스 로직을 처리하기 위하여 ReservationBiz 객체를 생성한다
		ReservationBiz rsvBiz = new ReservationBiz(1000);
		
		//2.필요한 예매수를 인자로 갖는 Art타입의 객체를 생성하여 예매한다
		Art movie  = new Movie(3);
		rsvBiz.addReservation(movie);
		Art musical  = new Musical(2);
		rsvBiz.addReservation(musical);
		Art drama  = new Drama(1);
		rsvBiz.addReservation(drama);
		
		//3.printReservation()메소드를 호출하여 예매정보를 출력한다.
		rsvBiz.printReservation();
		
	}
	
}
